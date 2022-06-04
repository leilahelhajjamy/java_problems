import java.util.Scanner;

public class CoountOddNumbers {
    public int lowestNumber ;
    public int highestNumber;

    CoountOddNumbers(int low, int high) {
        lowestNumber = low;
        highestNumber = high;
    }


    public static void main(String[] args) {
        CoountOddNumbers count = new CoountOddNumbers(1,10);

        int countOdd = 0;
        for(int i= 0; i< count.highestNumber - count.lowestNumber +1 ; i++){

            if((count.lowestNumber +i)%2 !=0){
                countOdd++;
                System.out.println("We run into an odd number  " + (count.lowestNumber +i));

            }
        }
        System.out.println("NUmber of odd numbers is " + countOdd);


    }

}
