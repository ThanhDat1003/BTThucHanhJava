import java.util.Scanner;
public class bai1701 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double delta;
        double x1, x2;
        System.out.println("Nhap vao A:");
        A = sc.nextDouble();
        System.out.println("Nhap vao B:");
        B = sc.nextDouble();
        System.out.println("Nhap vao C:");
        C = sc.nextDouble();
        delta = B*B - (4*A*C);
        x1 = (B*B - sqrt(delta))/(2*A);
        System.out.println("x1: " + x1);
        x2 = (B*B + sqrt(delta))/(2*A);
        System.out.println("x2: " + x2);
    }
    private static double sqrt(double delta) {
        return 0;
    }
}