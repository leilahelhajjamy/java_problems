import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseInteger {


    public int reverseInteger(int number) {
        String intToString = Integer.toString(number);
        String result = "";
        int i = intToString.length()-1;
        do{
            result += intToString.charAt(i);
            i--;
        } while(i>=0);

        if(Integer.parseInt(result) > Integer.MAX_VALUE || Integer.parseInt(result) < Integer.MIN_VALUE){
            result = "0";
        }

        return Integer.parseInt(result);
    }
    public static void main(String[] args){
        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        int myNumber = 0;
        try{
            myNumber = scan.nextInt();
        } catch(InputMismatchException e) {

        } finally{
            ReverseInteger reversedInteger = new ReverseInteger();
            System.out.println(reversedInteger.reverseInteger(myNumber));
        }

    }
}
