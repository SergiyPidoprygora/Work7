import java.util.Scanner;
//Створити метод який повертає куб заданого числа
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведіть число");
        int num = scanner.nextInt();
        int fact;
            fact = num * num * num;
        System.out.println(fact);
    }
}
