public class Runner {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a % 2 == 0) {
            System.out.println(a*1.5);
        }
        else {
            System.out.println(a*a);
        }
    }
}