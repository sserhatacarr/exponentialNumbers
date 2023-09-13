import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, k;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be exponentiated : ");
        n = sc.nextInt();

        System.out.print("Enter the number to be exponent : ");
        k = sc.nextInt();

        int total = 1;

        for(int i =1; i<=k; i++){
            total*=n;
        }

        System.out.print("Result = " +total);
    }
}
