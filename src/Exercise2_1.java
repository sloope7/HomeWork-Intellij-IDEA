import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int firstNumber = scanner1.nextInt();
        System.out.println("Введите второе целое число");
        int secondNumber = scanner1.nextInt();
        System.out.println("Введите симол операции");
        String symbol = scanner2.nextLine();
        switch (symbol){
            case "+":{
                System.out.println(firstNumber + secondNumber);
                break;
            }
            case "-":{
                System.out.println(firstNumber - secondNumber);
                break;
            }
            case "*":{
                System.out.println(firstNumber * secondNumber);
                break;
            }
            case "/":{
                System.out.println(firstNumber / secondNumber);
                break;
            }
            default:{
                System.out.println("Вы ввели неверный символ операции");
            }

        }
    }
}
