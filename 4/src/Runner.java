import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");
        int n = scan.nextInt();
        int res = 1;
        int i = 1;
        for (i = 2; i <= n; i++){
            res *= i;
        }
        System.out.println("Result = " + res);
    }
}

