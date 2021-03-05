import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int i;
        for(i = 0; i < 5; i++){
            System.out.println("Enter:");
            a[i] = scan.nextInt();
        }
        String str1;
        String str2;
        for (i = 0; i < 5; i++){
            str1 = (a[i]%2 == 0) ? "чёт" : "нечёт";
            str2 = (a[i]%(i+1) == 0) ? "да, делится" : "нет, не делится";
            System.out.println(str1);
            System.out.println(str2);
        }
    }
}
