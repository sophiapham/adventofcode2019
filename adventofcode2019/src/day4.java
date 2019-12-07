import java.util.ArrayList;
import java.util.List;

public class day4 {
    public static void main(String[] args) {
        int amountOfSolutions = 0;

        for (int i = 245318; i <= 765747; i++){
            if(isOrdAdj(i, isAdjacent(i), firstTwoAdj(i), lastTwoAdj(i))){
                amountOfSolutions++;
            }
        }
        System.out.println(amountOfSolutions);
    }

    static  boolean isOrdAdj (int number, boolean isAdj, boolean isTwo, boolean lastTwo){
        int sol = 0;
        for (int i = 0; i < 6; i++){
            if(isAdj || isTwo || lastTwo){
                if(number % 10 >= number/10 % 10){
                    sol++;
                }
            }
            number = number / 10;
        }
        if(sol == 6){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean firstTwoAdj(int number){
        if(number/10000 % 10 == number/100000 % 10){
            if(number/10000 % 10 != number/1000 % 10)
                return true;
        }
        return false;
    }

    static boolean lastTwoAdj(int number){
        if(number % 10 == number/10 % 10){
            if(number/10 % 10 != number/100 % 10)
                return true;
        }
        return false;
    }

    static boolean isAdjacent(int number){
        int sol = 0;
        for (int i = 0; i < 6; i++){
            if(number % 10 != number/10 % 10 && number/10 % 10 == number/100 % 10 && number/100 % 10 != number/1000 % 10){
                sol++;
            }
            number = number / 10;
        }
        if(sol >= 1){
            return true;
        }
        else{
            return false;
        }
    }
}
