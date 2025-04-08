import java.util.Scanner;

public class BracketMatchApp {

    public static void main(String[] args) {
        //Create an instance of the BracketMatcher class
        BracketMatcher parenTests = new BracketMatcher();

        Scanner myObj = new Scanner(System.in);
        //the string is made frm that line
        String s = myObj.nextLine();
        //parenTests.checkBrackets(s);

        if (parenTests.checkBrackets(s)) {
            System.out.println("Success!");
        } else {
            {
                System.out.println("Failure!");
            }


        }
    }
}
