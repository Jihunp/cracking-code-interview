/*
 * URLify: Write a method to replace all spaces in a
 *  string with '%20'. You may assume that the string
 *  has sufficient space at the end to hold the
 *  additional characters,and that you are given the
 *  "true" length of the string. (Note: If implementing 
 * in Java,please use a character array so that you can
 *  perform this operation in place.)
 */

 // many ways to solve the problem
 // assuming we have extra space for input string.
 // we count the number of spaces in input string
public class URLify {
  public static void main(String[] args) {
    replaceSpaces("Edward Parker Potter    ");
  }

  //assume we know the length of the char's needed
  void replaceSpaces(char[] str, int trueLength) {
    int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');
    int newIndex = trueLength - 1 + numberOfSpaces * 2;

    //excess spaces are covered by null character
    if(newIndex + 1 < str.length) str[newIndex + 1] = '\0';
    for(int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex -=1) {
      if(str[oldIndex] == ' ') {
        str[newIndex] = '0';
        str[newIndex - 1] = '2';
        str[newIndex - 2] = '%';
        newIndex -= 3;
      } else {
        str[newIndex] = str[oldIndex];
        newIndex -= 1;
      }
    }

  }

  //target is the space char
  int countOfChar(char[] str, int start, int end, int target) {
    int count = 0;
    for(int i = start; i < end; i++) {
      if(str[i] == target) {
        count++;
      }
    }
    return count;
  }
}

//auxilary storage solution
// input would be the "Edward Potter Park     "
// time complexity is O(N^2). N is the length of string
// aux space is O(1)
public static void replaceSpaces(String input) {
  String rep = "%20";
  for(int i = 0; i < input.length(); i++) {
    if(input.charAt(i) == ' ') {
      StringBuilder string = new StringBuilder(input); // makes immutable java string mutable
      string.setCharAt(i, rep);
    }
  }
  System.out.println(input);
}
  public static void main(String[] args)
  {
    String input = "Edward Potter Parker";
    replaceSpaces(input);
  }