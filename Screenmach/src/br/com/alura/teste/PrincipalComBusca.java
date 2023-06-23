package br.com.alura.teste;

import br.com.alura.exececoes.ErroDeConversaoDeAnoException;
import br.com.alura.modelo.Titulo;
import br.com.alura.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um Filme");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
               break;
            }

            FileWriter escrita = new FileWriter("filmes.txt");
            escrita.write(gson.toJson(titulos));
            escrita.close();

            System.out.println("O progama finalizou corretamente");

        String chave = "=2cf100";
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey" + chave;

        try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, BodyHandlers.ofString());
        System.out.println(response.body());

        String json = response.body();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        titulos.add(meuTitulo);

        System.out.println(meuTituloOmdb);
        System.out.println("Titulo ja convertido");
        System.out.println(meuTitulo);

        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro aqui.");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("algum erro de argumento na busca, verificar endereço");
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }
        }

        System.out.println("O progama finalizou corretamente");

    }

}
