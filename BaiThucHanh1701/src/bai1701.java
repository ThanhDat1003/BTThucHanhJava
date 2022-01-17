import javax.sound.sampled.SourceDataLine;
public class giaiphuongtrinh {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double A, B, C;
        double delta;
        double x1, x2;
        System.out.println("Nhap vao A:");
        A = scan.nextDouble();
        System.out.println("Nhap vao B:");
        B = scan.nextDouble();
        System.out.println("Nhap vao B:");
        C = scan.nextDouble();
        delta = B*B - (4*A*C);
        x1 = (B*B - sqrt(delta))/(2*A);
        x2 = (B*B + sqrt(delta))/(2*A);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
    private static double sqrt(double delta) {
        return 0;
    }
}