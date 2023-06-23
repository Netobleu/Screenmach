package br.com.alura.exececoes;

public class ErroDeConversaoDeAnoException extends RuntimeException {

    private String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return this.mensagem;
    }
}
