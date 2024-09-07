import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = sc.nextFloat();
        System.out.println("Enter the second number");
        float b = sc.nextFloat();
        System.out.println("Enter the third number");
        float c = sc.nextFloat();
        if (a>b && a>c){
            System.out.println("gearter number is"+a);
        }else if(b>a && b>c){
            System.out.println("greater number is"+b);
        }else{
            System.out.println("greater number is"+c);
        }
    }
}