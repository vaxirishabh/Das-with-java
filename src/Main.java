import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number ");
        int num = sc.nextInt();
        if (num<0){
            System.out.println("Number is negative");
        }else if (num > 0) {

            System.out.println("number is positive");
        }else{
            System.out.println("number is zero");

        }
    }
}