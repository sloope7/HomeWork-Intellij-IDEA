package Exercise8;

import java.util.Scanner;

public class Exercise8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                System.out.println("Ne polindrom");
                return;
            }
        }
        System.out.println("Polindrom");
    }
}
