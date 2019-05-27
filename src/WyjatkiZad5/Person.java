package WyjatkiZad5;

import java.util.Objects;

public class Person {

    private String name;
    private int funds;


    public Person(String name) {
        this.name = name;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public void deposit(int value) {
        funds += value;
    }

    public void withdraw(int value) throws InsufficientFundsException {

        if (funds < value) {
            throw new InsufficientFundsException("Niewystarczajaca ilosc srodkow");
        }
        funds -= value;
    }

    public void printReceipt(){
        System.out.println("Dostepne srodki: "+funds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return funds == person.funds &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, funds);
    }
}