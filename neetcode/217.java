// contains duplicate

class Solution {
   public boolean containsDuplicate(int[] nums) {
      //uses a hashset. hashset has unique sets of elements
      // therefore if a duplicate cannot be added then the program
      // is false.
       HashSet<Integer> map = new HashSet<>();

       for(int num : nums) {
           if( !map.add(num) ) {
               return true;
           }
       }
       return false;
   }
}