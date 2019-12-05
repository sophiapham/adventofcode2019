import java.util.ArrayList;
import java.util.List;

public class day4 {
    public static void main(String[] args) {
        int amountOfSolutions = 0;

        for (int i = 245318; i <= 765747; i++){
            if(isOrdAdj(i)){
                amountOfSolutions++;
            }
        }
        System.out.println(amountOfSolutions);
        System.out.println(isOrdAdj(111111));
    }

    static  boolean isOrdAdj (int number){
        int sol = 0;
        for (int i = 0; i < 6; i++){
            if(isAdjacent(number)){
                if(number % 10 == number/10 % 10 || number % 10 > number/10 % 10){
                sol++;
                }
            number = number / 10;
            }
        }
        if(sol == 6){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean isAdjacent(int number){
        for (int i = 0; i < 6; i++){
            if(number % 10 == number/10 % 10){
                return true;
            }
            number = number / 10;
        }
    return false;
    }
}
