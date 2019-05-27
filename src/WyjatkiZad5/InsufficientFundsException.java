package WyjatkiZad5;

public class InsufficientFundsException extends java.lang.Exception {

//jesli chce zmienic komunikat, to moge stworzyc konstruktor, nadpisujacy komunikat


    public InsufficientFundsException(String message) {
        super(message);
    }
}
