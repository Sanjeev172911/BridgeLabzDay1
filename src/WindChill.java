import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Find the Wind Chill");

        Scanner input=new Scanner(System.in);
        System.out.println("Enter v :");
        double v=input.nextDouble();
        System.out.println("Enter t :");
        double t=input.nextDouble();

        if(t>50) System.out.println("Lower the value of t");
        if(v<3 || v>120) System.out.println("value of v should be between range from 3 to 120");

        double powerOfV=Math.pow(v,.16);

        double w=35.74+.6215*t+(04275*t-35.75)*powerOfV;

        System.out.println("wind chill "+w);
    }
}