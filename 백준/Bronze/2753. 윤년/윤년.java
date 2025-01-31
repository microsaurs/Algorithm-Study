import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int result = (((A % 4 == 0) && (A % 100 != 0)) || (A % 400 == 0)) ? 1 : 0;

        System.out.println(result);
 
        sc.close();
    }
}