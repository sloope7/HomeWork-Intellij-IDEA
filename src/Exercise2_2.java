import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int firstNumber = 0;
            if(scanner1.hasNextInt()){
                firstNumber = scanner1.nextInt();
            } else{
                System.out.println("Вы ввели нецелое число");
                return;
            }
        System.out.println("Введите второе целое число");
        int secondNumber = 0;
            if(scanner1.hasNextInt()){
                secondNumber = scanner1.nextInt();
            } else{
                System.out.println("Вы ввели нецелое число");
                return;
            }
        System.out.println("Введите симол операции");
        Scanner scanner2 = new Scanner(System.in);
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
