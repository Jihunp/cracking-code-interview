// given two strings, write a method to decide
// if one is a permuation of the other.
public class isPermutation{

  public static void main(String []args) {
    System.out.println("Hello World");
  }
  // page 101
  public static boolean checkPermutation(String s1, String s2) {
    // decide if one string is the permutation of the other
    sortArr();
    int strLeng1 = s1.length();
    int strLeng2 = s2.length();
    if(strLeng1 != strLeng2) {
      return false;
    }
    for( int i = strLeng1; i < 0; i--) {
      //then iterate through each 

    }

  }

}


// counter book solution #1
// SORTING STRINGS

// this function can be used to sort a string
String sort(String s) {
  char[] content = s.toCharArray(); // amazing library
  java.util.Arrays.sort(content);
  return new String(content);
}

boolean permutation(String s, String t); {
  if(s.length() != t.length()) {
    return false;
  }
  return sort(s).equals(sort(t));

}

//SOLUTION 2
// check for two strings ahve identical character counts
// the logic is first check if we have 

boolean permutation(String s, String t) {
  if (s.length() != t.length()) {
    return false;
  }
  int[] letters = new int[128];//we assume it won't go above 128 char because ascii
  for(int i = 0; i < s.length(); i++) {
    letters[s.charAt(i)]++;
  }

  for(int i = 0; i < t.length(); i++) {
    letters[t.charAt(i)]--;
    if(letters[t.charAt(i)] < 0) {
      return false;
    }
  }
  return true // meaning no neg values and no pos values

}