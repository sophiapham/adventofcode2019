import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] inputArray = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,6,1,19,1,5,19,23,1,13,23,27,1,6,27,31,2,31,13,35,1,9,35,39,2,39,13,43,1,43,10,47,1,47,13,51,2,13,51,55,1,55,9,59,1,59,5,63,1,6,63,67,1,13,67,71,2,71,10,75,1,6,75,79,1,79,10,83,1,5,83,87,2,10,87,91,1,6,91,95,1,9,95,99,1,99,9,103,2,103,10,107,1,5,107,111,1,9,111,115,2,13,115,119,1,119,10,123,1,123,10,127,2,127,10,131,1,5,131,135,1,10,135,139,1,139,2,143,1,6,143,0,99,2,14,0,0};
        inputArray[1] = 57;
        inputArray[2] = 41;
        for(int i = 0; i < inputArray.length;){
            int maybeOP = inputArray[i];
            if(maybeOP == 1){
                inputArray[inputArray[i+3]] = inputArray[inputArray[i+1]] + inputArray[inputArray[i+2]];
                i = i + 4;
            }
            else if(maybeOP == 2){
                inputArray[inputArray[i+3]] = inputArray[inputArray[i+1]] * inputArray[inputArray[i+2]];
                i = i + 4;
            }
            else if(maybeOP == 99){
                //i++;
                break;
            }
        }
        System.out.println("Result should be: 19690720.\nThe result is: " + inputArray[0]);
        System.out.println("Answer: " + 100 * 57 + 41);
    }
}
