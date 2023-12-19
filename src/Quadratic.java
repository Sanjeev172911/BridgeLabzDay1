import java.util.Scanner;

public class Quadratic {
    public static int findD(int a,int b,int c){
        return b*b-4*a*c;
    }

    public static void findRoots(int a,int b,int D){
        double d=Math.sqrt(D);
        double x1=(-b*1.0+d)/(2*a*1.0);
        double x2=(-b*1.0-d)/(2*a*1.0);

        System.out.println("First Root "+x1);
        System.out.println("Second Root "+x2);
    }

    public static void main(String[] args) {
        System.out.println("Enter a b c for Quadratic Equation ");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a");
        int a=input.nextInt();
        System.out.println("Enter b");
        int b=input.nextInt();
        System.out.println("Enter c");
        int c=input.nextInt();

        int disciminant=findD(a,b,c);

        if(disciminant<0) System.out.println("Quadratic equation has no real roots");
        else{
            findRoots(a,b,disciminant);
        }

    }
}
