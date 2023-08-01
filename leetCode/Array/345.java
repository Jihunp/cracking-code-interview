//reverse the vowels in the string

public class Solution {
  public static String vow(String s) {
    return reverseVowels(s);
  }
  public static boolean isVowel(char c) {
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        c == 'A' || c == 'E' || c == 'I' ||c == 'O' || c == 'U');
  }

  public static String reverseVowels(String s) {
    int j = 0;
    char[] str = s.toCharArray();
    String vowel = "";
    for(int i = 0; i < str.length; i++) {
      if(isVowel(str[i])) {
        j++;
        vowel += str[i];
      }
    }
    for(int i = 0; i < str.length; i++) {
      if(isVowel(str[i])) {
        str[i] = vowel.charAt(--j);
      }
    }
    return String.valueOf(str);
  }
}