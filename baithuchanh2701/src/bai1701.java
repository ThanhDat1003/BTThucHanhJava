import java.util.Scanner;
public class bai1701 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap he so bac 2, a = ");
        float a = bai1701.scanner.nextFloat();
        System.out.print("Nhap he so bac 1, b = ");
        float b = bai1701.scanner.nextFloat();
        System.out.print("Nhap hang so tu do, c = ");
        float c = scanner.nextFloat();
        bai1701.giaiPTBac2(a, b, c);
    }
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Pt vo nghiem!");
            } else {
                System.out.println("Pt co 1 nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Pt co 2 nghiem la: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Pt co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Pt vo nghiem!");
        }
    }
}