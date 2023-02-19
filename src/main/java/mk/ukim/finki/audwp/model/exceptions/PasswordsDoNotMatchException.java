package mk.ukim.finki.audwp.model.exceptions;

public class PasswordsDoNotMatchException extends RuntimeException{

    public PasswordsDoNotMatchException(){
        super("Passwords do not match!");
    }
}
