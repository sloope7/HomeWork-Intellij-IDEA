import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int number;
        int sum = 0;
        while (i < 10){
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }else{
                System.out.println("Vi vveli neceloe chislo");
                return;
            }
            sum += number;
            i++;
        }
        System.out.println(sum);
    }
}
