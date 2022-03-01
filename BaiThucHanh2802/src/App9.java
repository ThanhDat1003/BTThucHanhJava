import java.util.Scanner;

public class App9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, d = 0;
        System.out.println("Nhap vao so can dao nguoc: ");
        n1 = sc.nextInt();
        n2 = n1;
        while (n1 != 0) {
            int c = n1 % 10;
            d = d * 10 + c;
            n1 = n1 / 10;
        }
        System.out.printf("So %d sau khi dao nguoc10 la: %d", n2, d);

    }
}