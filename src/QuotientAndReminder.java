import java.util.Scanner;

public class QuotientAndReminder {
    public static int findQuotient(int divident,int divisior){
        return divident/divisior;
    }

    public static int findReminder(int divident,int divisior){
        return divident%divisior;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the divident ");
        int divident=input.nextInt();
        System.out.println("Enter the divisor");
        int divisor=input.nextInt();

        System.out.println("Quotient is "+findQuotient(divident,divisor));
        System.out.println("Reminder is "+findReminder(divident,divisor));
    }

}
