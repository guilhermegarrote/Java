import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        for ( int y = 1; y <= x; y += 2 ) {
            System.out.println(y);
        }

        sc.close();
    }
}