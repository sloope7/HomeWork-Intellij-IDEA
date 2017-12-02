import java.util.Scanner;

public class Exercise3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Vi vveli neceloe chislo");
                return;
            }
            if (number % 2 == 0) countEven++;
            else countOdd++;
        }
        System.out.println("Kolichestvo chetnih chisel " + countEven);
        System.out.println("Kolichestvo nechetnih chisel " + countOdd);
    }
}
