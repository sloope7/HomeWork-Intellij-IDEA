import java.util.*;

public class Chernovik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo elementov");
        int number = scanner.nextInt();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        while (hashSet.size() < number){
            hashSet.add(r.nextInt(number *2));
        }

        for (Integer i : hashSet) {
            list.add(i);
        }
        int max = list.get(0);
        int min = list.get(0);
        for (int j : list) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        System.out.print("Elementi massiva: ");
        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }
        System.out.println("\nMaksimalnoe chislo " + max);
        System.out.println("Minimalnoe chislo " + min);
    }
}