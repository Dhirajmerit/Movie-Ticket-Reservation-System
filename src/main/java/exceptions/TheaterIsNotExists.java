package exceptions;

public class TheaterIsNotExists extends RuntimeException{
    private static final long serialVersionUID = -80039152090012599L;

    public TheaterIsNotExists() {
        super("Theater is not present in this address");
    }
}