package pl.kuba.game.exception;

public class ControllerException extends RuntimeException {

    private ErrorMessage errorMessage;

    public ControllerException(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorMessage getError(){
        return errorMessage;
    }
}
