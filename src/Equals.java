import WyjatkiZad5.Person;

public class Equals {

    public static void main(String[] args) {

        Person p=new Person("kasia");
        Person p1=new Person("kasia");

        System.out.println(p==p1);
        System.out.println(p.equals(p1));

//        Obiekty porównujemy za pomocą equals.
//        ALE jeżeli będziemy mieli obiekt, który stworzymy na podstawie własnej klasy, nadal porównywane sa miejsca w pamięci, a nie wartość obiektu.
//        Wtedy trzeba nadpisać metody equals i hashCode.
//

    }
}
