import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class BracketMatcher {
    //arrays for open and closed
    char[] openarray = {'(', '[', '{', '<'};
    char[] closearray = {')', ']', '}', '>'};
    int i = 0;





    /**
     *
     * @param c
     * @return boolean
     * use find method search opening array list for char c
     */
    //BracketMatcher class
    public boolean isOpeningBracket(char c) {
        if (0<=find(c,openarray)) return true;
        else return false;

    }

    /**
     *
     * @param c
     * @return boolean
     * use find method search closed array list for char c
     */
    public boolean isClosingBracket(char c) {
        if (0<=find(c,closearray)) return true;
        else return false;

    }



    /**
     *
     * @param c
     * @param A
     * @return int
     * iterate through array A to find c.
     * returns index if found
     * else returns -1
     */
    public int find(char c, char[] A) {
        for (int i = 0; i < A.length; i++){
            if (A[i] == c) return i;
        }
        return -1;

    }

    /**
     *
     * @param open
     * @param close
     * @return boolean
     * use find method to get open parenthesis index
     * use find method to get close paraenthesis index
     * if index same return true
     * else return false
     */
    public boolean corresponds(char open, char close) {
        if (find(open,openarray) == find(close,closearray))return true;
        else return false;

    }

    public boolean checkBrackets(String s) {

        SinglyLinkedStack<Character> openParen = new SinglyLinkedStack<>();
        boolean done = false;



        //create a scanner object


        if (s.isEmpty()) {
            return false;
        }
        else {
            for (i=0; i<s.length(); i++){
                if (!(isOpeningBracket(s.charAt(i)) || (isClosingBracket(s.charAt(i))))) {

                    i++;
                    System.out.println(s.charAt(i));
                    if (i == s.length()){
                        break;

                    }

                }

                String newParen = String.valueOf(s.charAt(i)); //maybe find different way
                if (isOpeningBracket(s.charAt(i))) {
                    openParen.push(s.charAt(i));
                }
//isClosingBracket(s.charAt(i))
                else if (openParen.isEmpty()){

                    System.out.println("error at1: " + i);
                    return false;
                }
                else if (isClosingBracket(s.charAt(i))) {
                    //System.out.println(s.charAt(i));
                    //System.out.println(openParen.pop());
                    if (corresponds(openParen.top(),s.charAt(i)))
                        openParen.pop();

                }

                else if (isClosingBracket(s.charAt(i))){
                    System.out.println("error at2: " + i);
                    return false;
                }




            }
            if (openParen.isEmpty() && done == false){
                return true;
            }
            else if (done == false){

                System.out.println("error at3: " + i);
                return false;

            }
        }


        //if stack is completely empty
        //else string is not matched
        //if parenTests.corresponds() //this will be the boolean


        return done;
    }





}