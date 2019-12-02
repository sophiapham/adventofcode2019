import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;
        File file = new File("C:\\Users\\Pixie Waffle\\Desktop\\adventofcode2019\\adventofcode2019\\day1\\day1.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            int res = sc.nextInt();
            int temp = Math.floorDiv(res, 3) - 2;
            sum = sum + temp;
        }

        System.out.println(sum);
    }

}
