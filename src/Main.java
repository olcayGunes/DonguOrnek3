import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Sayı: ");
        number = input.nextInt();

        int i = 1;
        while (i <= number) {
            System.out.println(i + " üzeri 4 = " + Math.pow(i, 4));
            System.out.println(i + " üzeri 5 = " + Math.pow(i, 5));
            System.out.println("---------------------------------------------");
            i++;
        }
    }
}
