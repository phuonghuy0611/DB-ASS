package backend.exception;

@SuppressWarnings("serial")
public class InvalidAgeInputingException extends Exception{
    public InvalidAgeInputingException(String mesage){
        super(mesage);
    }
}
