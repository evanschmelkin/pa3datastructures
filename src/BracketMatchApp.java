import java.util.Scanner;

public class BracketMatchApp {

    public static void main(String[] args) {
        //Create an instance of the BracketMatcher class
        BracketMatcher parenTests = new BracketMatcher();
        SinglyLinkedStack<Character> openParen = new SinglyLinkedStack<>();
        boolean done = false;



        //create a scanner object
        Scanner myObj = new Scanner(System.in);
        //the string is made frm that line
        String s = myObj.nextLine();

        if (s.isEmpty()) {
            System.out.println("This is not good: its empty");
        }
        else {
            for (int i=0; i<s.length(); i++){
                String newParen = String.valueOf(s.charAt(i)); //maybe find different way
                if (parenTests.isOpeningBracket(s.charAt(i))) {
                    openParen.push(s.charAt(i));
                }

                else if (openParen.isEmpty()){
                    System.out.println("This is not a good string part 0s");
                    System.out.println("error at: " + i);
                    done = true;
                    break;
                }
                else if (parenTests.corresponds(openParen.top(),s.charAt(i))) {
                    //System.out.println(s.charAt(i));
                    //System.out.println(openParen.pop());
                    openParen.pop();

                }

                else {
                    System.out.println("This is not a good string part 1");
                    System.out.println("error at: " + i);
                    done = true;
                    break;
                }




            }
            if (openParen.isEmpty() && done == false){
                System.out.println("Thats a good string!");
            }
            else if (done == false){
                System.out.println("This is not a good string part 2");
                System.out.println("error at: " + (s.length() -1));

            }
        }


        //if stack is completely empty
        //else string is not matched
        //if parenTests.corresponds() //this will be the boolean





    }
}
