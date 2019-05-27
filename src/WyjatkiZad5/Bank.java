package WyjatkiZad5;

public class Bank {

    public static void main(String[] args) {

        Person person = new Person("Kasia");

        person.setFunds(1000);

        person.deposit(600);

        try {
            person.withdraw(1800);
        }catch (InsufficientFundsException e){
            e.printStackTrace();
        }

        person.printReceipt();

    }
}
