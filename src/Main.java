import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        double a = sc.nextDouble();
        System.out.println("Input b");
        double b = sc.nextDouble();
        System.out.println("input c");
        double c = sc.nextDouble();
        double result = b*b-4*a*c;
        if (result>0){
            double r1 = (-b + Math.pow(result,0.5))/(2.0*a);
            double r2 = (-b + Math.pow(result,0.5))/(2*a);
            System.out.println("The root are"+ r1 +"and"+r2);
        }else if (result==0){
            double r1 =-b/(2.0*a);
            System.out.println("the root is:"+r1);
        }else {
            System.out.println("the eqtn has no real roots");
        }
    }
}