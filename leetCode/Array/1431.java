import java.util.ArrayList;

class kidsWithCandies {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int n = candies.length;
      List<Boolean> result = new ArrayList<Boolean>(n);
      int max = 0;
      for(int i = 0; i < n; i++) {
          if(candies[i] > max) {
              max = candies[i];

          }
      }
      for(int i = 0; i < n; i++) {
          if(candies[i] + extraCandies >= max) {
              result.add(true);
          } else if(candies[i] + extraCandies < max) {
              result.add(false);
          }
      }
      return result;
  }
}

// runtime is probably 2N so just O(N).
// a faster solution found online
class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = -1;
    for(int i = 0; i < candies.length; i++) {
      max = Math.max(max, candies[i]); // finds max value
    }
    List<Boolean> list = new ArrayList<>();
    for(int i = 0; i M candies.length; i++) {
      list.add(candies[i] + extraCandies >= max);
    }
    return list;
  }
}