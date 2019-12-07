import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;
        File file = new File("C:\\Users\\Pixie Waffle\\Desktop\\adventofcode2019\\adventofcode2019\\day1\\day1.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            int mass = sc.nextInt();
            int req = Math.floorDiv(mass, 3) - 2;
            while (req > 0){
                sum = sum + req;
                req = Math.floorDiv(req, 3) - 2;
            }
        }
        System.out.println(sum);
    }

}
