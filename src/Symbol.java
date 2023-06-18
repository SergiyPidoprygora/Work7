import java.util.Scanner;

public class Symbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведіть число");
        int num = scanner.nextInt();
        int c=1;
        while (c <= num) {
            System.out.println("B");
            c++;
        }
    }
}