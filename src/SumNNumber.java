import java.util.Scanner;

public class SumNNumber {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter A number for sum");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Your sum is" +sum);
    }
}
