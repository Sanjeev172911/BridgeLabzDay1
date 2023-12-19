import java.util.Scanner;

public class VowelOrConsonent {
    public static boolean checkIsVowel(char letter){
        letter=Character.toLowerCase(letter);
        if(letter=='a' || letter=='e' ||letter=='i' || letter=='o' || letter=='u') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char letter=input.next().charAt(0);

        boolean isVowel=checkIsVowel(letter);

        if(isVowel){
            System.out.println(letter+" is a vowel");
        }else{
            System.out.println(letter+" is a consonent");
        }
    }
}
