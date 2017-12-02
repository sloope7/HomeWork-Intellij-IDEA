import java.util.Scanner;

public class Exercise3_6 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int number = 0;
        int degree = 0;
        System.out.println("Vvedite celoe chislo");
        if (scanner1.hasNextInt()) {
            number = scanner1.nextInt();
        } else {
            System.out.println("Vi vveli neceloe chislo");
            return;
        }
        System.out.println("Vvedite stepen");
        if (scanner2.hasNextInt()) {
            degree = scanner2.nextInt();
        } else {
            System.out.println("Vi vveli neceluyu stepen");
            return;
        }
        int result = 1;
        for (int i = 0; i < degree; i++) {
            result *=number;
        }
        System.out.println(result);
    }
}
