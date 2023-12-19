import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if((year%4==0 && year%100!=0) || year%400==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();

        if(isLeapYear(year)){
            System.out.print(year);
            System.out.println(" is a Leap Year");
        }else {
            System.out.print(year);
            System.out.println(" is not a Leap Year");
        }
    }
}

