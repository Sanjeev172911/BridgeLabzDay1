import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HeadTail {
    public static double tailPercentage(int numberOfTurn){
        Random random=new Random();
        int tailCnt=0;
        for(int i=0;i<numberOfTurn;i++){
            double probablity=random.nextDouble();
            System.out.println(probablity);
            if(probablity<0.5) tailCnt++;
        }

        double tailPercent=(double)(tailCnt*1.0/numberOfTurn)*100;
        return tailPercent;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numberOfTurn=input.nextInt();

        double tailPercent=tailPercentage(numberOfTurn);
        double headPercent=100-tailPercent;

        System.out.print("% of Head is ");
        System.out.println(headPercent);
        System.out.print("% of Tail is ");
        System.out.println(tailPercent);
    }

}
