package br.com.isaque.gestao_vagas.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(){
        super("User not found");
    }
}
