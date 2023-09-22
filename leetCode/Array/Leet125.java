public class Leet125 {
  public static void main(String[] args) {
    String s = "what";
    System.out.print(isPalindrome(s));
  }
    public static boolean isPalindrome(String s) {
        

        //check digits
        //check letters
        //check punctuation

        // alphanumeric regex [^a-zA-Z\d\s:]

        //take a string then remove all non-alphanumeric characters
        //take a string and ignore non-alphanumeric characters
        String alphaString = "";
        
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c) || Character.isLetter(c)) {
                alphaString += c;
            }
        }
        alphaString = alphaString.toLowerCase();
        //make pointers
        int front = 0;
        int back = alphaString.length() - 1;

        while(front <= back) {
            if(alphaString.charAt(front) != alphaString.charAt(back)) {
                return false;

            }
            front += 1;
            back -= 1;
        }
        return true;
    }
}