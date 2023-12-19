import java.util.Scanner;

public class FindLargest {
    public static int findMaximum(int a,int b,int c){
        return (a>b?(a>c?a:c):(b>c?b:c));
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st Number ");
        int a=input.nextInt();
        System.out.println("Enter the 2st Number ");
        int b=input.nextInt();
        System.out.println("Enter the 3st Number ");
        int c=input.nextInt();

        System.out.println("Maximum among a b c is "+findMaximum(a,b,c));
    }
}
