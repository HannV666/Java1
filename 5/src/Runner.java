import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double sr;
        sr = (a+b+c)/3;
        System.out.println(sr);
    }
}
