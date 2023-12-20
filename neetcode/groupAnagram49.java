import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class groupAnagram49 {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for(String word : strs) {
      //split into char
      char[] chars = word.toCharArray();
      //sort array
      Arrays.sort(chars);
      // make sorted word
      String sortedWord = new String(chars);

      //if hashmap does not contain the word then make a new array with the word intake
      if(!map.containsKey(sortedWord)) {
        map.put(sortedWord, new ArrayList<>());
      }
      map.get(sortedWord).add(word);
    }
    return new ArrayList<>(map.values());
  }
}
