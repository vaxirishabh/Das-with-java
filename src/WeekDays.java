import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number Between 1-7");
        int n = sc.nextInt();
        switch (n){
            case 1: System.out.println("Today is Monday");
            break;
            case 2: System.out.println("Today is tuesday");
            break;
            case 3: System.out.println("Today is wednesday");
            break;
            case 4: System.out.println("Today is thursday");
            break;
            case 5: System.out.println("Today is Friday");
            break;
            case 6: System.out.println("Today is Saturday");
            break;
            case 7: System.out.println("Today is Sunday");
            default : System.out.println("You Did not enter a number between 1 to 7");
        }

    }

}
