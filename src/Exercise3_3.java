import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Vi vveli neceloe chislo");
                return;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
