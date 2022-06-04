import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueens {

    public static void main(String[] args) {
        System.out.println("Enter the size of the chessboard");
        Scanner scan = new Scanner(System.in);
        int taille = scan.nextInt();
        List<Pair> pairList = new ArrayList<>();
        for(int i = 0 ; i<taille ; i++) {
            int sum = 0;
            for(int j = 0 ; j<taille ; j++){

            }

        }
    }

}




class Pair{
    int x = 0;
    int y = 0;
    Pair( int n , int x , int y) {
        this.x = x;
        this.y = y;
    }
}


