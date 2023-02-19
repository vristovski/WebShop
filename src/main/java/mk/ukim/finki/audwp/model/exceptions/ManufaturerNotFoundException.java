package mk.ukim.finki.audwp.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ManufaturerNotFoundException extends RuntimeException{
    public ManufaturerNotFoundException(Long id){
        super(String.format("Manufacturer with id %d was not found", id));
    }
}
