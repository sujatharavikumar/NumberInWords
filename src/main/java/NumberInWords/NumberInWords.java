package NumberInWords;

/**
 * Created by sujatharavikumar on 9/24/16.
 */
public class NumberInWords {

    private final String[] oneToTwenty = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                                            "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                                            "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private final String hundred = " Hundred ";

    public String convertNumber(int number){
        if (number < 20)
            return oneToTwenty[number];
        else if (number >= 20 && number<100){
            if (oneToTwenty[number%10].equals("Zero"))
                return tens[number/10];
            else
                return tens[number/10]+ " " +oneToTwenty[number%10];
        }
        else if (number >= 100){
            if(number%100 == 0)
                return oneToTwenty[number/100]+hundred;
            else
                return oneToTwenty[number/100]+hundred+"and "+convertNumber(number%100);
        }
        else
            return null;

    }

}
