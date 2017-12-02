import java.util.Random;
import java.util.Scanner;

public class Exercise5_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo elementov massiva");
        int arraySize = scanner.nextInt();
        int [] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(1287) - 20;
            array[i] = number;
        }

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        System.out.println("Maksimalnii element massiva " + max);
        System.out.println("Minimalnii element massiva " + min );

    }
}
