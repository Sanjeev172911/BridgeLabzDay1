import java.util.Scanner;

public class Distance {
    public static double findEculideanDisatnce(int x,int y){
        return Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the cordinate");
        int xCordinate=input.nextInt();
        int yCordinate=input.nextInt();

        System.out.println("Eculidean Distance = "+findEculideanDisatnce(xCordinate,yCordinate));
    }
}
