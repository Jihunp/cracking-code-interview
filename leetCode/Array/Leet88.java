import java.util.Arrays;

class Leet88 {
  /*
  public static void main(String[] args) {
    System.out.println("hello");
    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};
    int m = 3;
    int n = 3;
    merge(nums1, m, nums2, n);
  }
  */
  
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int a = m - 1;
    int b = n - 1;
    int c = m + n - 1; //stay inside index bounds last digit
    while(a >= 0 && b >=0) {
      if(nums1[a] > nums2[b]) {
        nums1[c--] = nums1[a--];
      }
      else{
        nums1[c--] = nums2[b--];
      }
    }
    while(b >= 0) {
      nums1[c--] = nums2[b--];
    }
    System.out.print(Arrays.toString(nums1));
  }
}
