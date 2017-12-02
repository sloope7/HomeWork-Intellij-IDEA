package Exercise8;

import java.util.Scanner;

public class Exercise8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() == 0){
            System.out.println("Net ni odnogo slova");
            return;
        }
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') count++;
        }
        System.out.println("Kolichestvo slov " + count);
    }
}
