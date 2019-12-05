import java.util.ArrayList;
import java.util.List;

public class day4 {
    public static void main(String[] args) {
        int amountOfSolutions = 0;

        for (int i = 245318; i <= 765747; i++){
            if(isOrdAdj(i, isAdjacent(i), firstTwoAdj(i))){
                amountOfSolutions++;
            }
        }
        System.out.println(amountOfSolutions);

        System.out.print("true: "); //true
        boolean isAdj = isAdjacent(112356);
        boolean isTwo = firstTwoAdj(112356);
        System.out.println(isOrdAdj(112356, isAdj, isTwo));

        System.out.print("false: "); //false
        boolean isAdj1 = isAdjacent(123444);
        boolean isTwo1 = firstTwoAdj(123444);
        System.out.println(isOrdAdj(123444, isAdj1, isTwo1));

        System.out.print("true: "); //true
        boolean isAdj2 = isAdjacent(111122);
        boolean isTwo2 = firstTwoAdj(111122);
        System.out.println(isOrdAdj(111122, isAdj2, isTwo2));

        System.out.print("false: "); //false
        boolean isAdj3 = isAdjacent(111111);
        boolean isTwo3 = firstTwoAdj(111111);
        System.out.println(isOrdAdj(111111, isAdj3, isTwo3));

        System.out.print("false: "); //false
        boolean isAdj4 = isAdjacent(223450);
        boolean isTwo4 = firstTwoAdj(223450);
        System.out.println(isOrdAdj(223450, isAdj4, isTwo4));

        System.out.print("false: "); //false
        boolean isAdj5 = isAdjacent(123789);
        boolean isTwo5 = firstTwoAdj(123789);
        System.out.println(isOrdAdj(123789, isAdj5, isTwo5));

        System.out.print("true: "); //true
        boolean isAdj6 = isAdjacent(112233);
        boolean isTwo6 = firstTwoAdj(112233);
        System.out.println(isOrdAdj(112233, isAdj6, isTwo6));



    }

    static  boolean isOrdAdj (int number, boolean isAdj, boolean isTwo){
        int sol = 0;
        for (int i = 0; i < 6; i++){
            if(isAdj || isTwo){
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

    static boolean isAdjacent(int number){
        for (int i = 0; i < 6; i++){
            if(number % 10 == number/10 % 10){
                if(number/10 % 10 == number/100 % 10) {
                    return false;
                }
                else{
                    return true;
                }
            }
            number = number / 10;
        }
        return false;
    }
}
