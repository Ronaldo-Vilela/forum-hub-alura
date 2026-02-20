package br.com.forumhub.exception;

public class TratadorDeErros extends RuntimeException {
    public TratadorDeErros(String message) {
        super(message);
    }
}
