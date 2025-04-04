public class BracketMatcher {
    //arrays for open and closed
    char[] openarray = {'(', '[', '{', '<'};
    char[] closearray = {')', ']', '}', '>'};


    /**
     * initiator
     */
    public BracketMatcher(){

    }

    /**
     *
     * @param c
     * @return boolean
     * use find method search opening array list for char c
     */
    //BracketMatcher class
    public boolean isOpeningBracket(char c) {

    }

    /**
     *
     * @param c
     * @return boolean
     * use find method search closed array list for char c
     */
    public boolean isClosingBracket(char c) {

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
    public int find(char c, A[]) {
        for (int i = 0; i < A.length; i++){
            if (A[i] == c) return i;
        }
        return -1;

    }





}