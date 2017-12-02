import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        while (count<10){
            System.out.println("Введите число " + (count + 1));
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }else {
                System.out.println("Вы ввели нецелое число");
                return;
            }
            sum+= number;
            count++;
        }
        System.out.println("Сумма чисел " + sum);
    }
}
