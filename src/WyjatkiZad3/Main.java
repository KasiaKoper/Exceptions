package WyjatkiZad3;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};

        int[] array2={4526,45,87};

        try {
            System.out.println(plusFive(array1, 6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Podany index tablicy nie istnieje!");
        }
    }


    public static int plusFive(int[] array, int index) {
        int newValue = 0;
        newValue = array[index] += 5;
        return newValue;
    }

}
