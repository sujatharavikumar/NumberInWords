package NumberInWords;
import java.util.Scanner;
/**
 * Created by sujatharavikumar on 9/24/16.
 */
public class Application {

    public static void main(String[] args) {

        NumberInWords numberObject = new NumberInWords();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        String wordRepresentation = numberObject.convertNumber(number);
        System.out.println(wordRepresentation);

    }

}
