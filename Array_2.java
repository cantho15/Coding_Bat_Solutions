//Solutions from the Array-2 section of Coding Bat

public class Array_2 {

  public static void main(String[] args) {
    
  }

  
  public static int countEvens(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        count++;
      }
    }
    return count;
  }



  public static int bigDiff(int[] nums) {
    int big = nums[0];
    int small = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < small) {
        small = nums[i];
      }
      if (nums[i] > big) {
        big = nums[i];
      }
    }
    return big - small;
  }



  public static int centeredAverage(int[] nums) {
    int total = 0;
    int big = nums[0];
    int small = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < small) {
        small = nums[i];
      }
      if (nums[i] > big) {
        big = nums[i];
      }
      total += nums[i];
    }
    return (total - small - big) / (nums.length - 2);
  }

  
  
  public static int sum13(int[] nums) {
    int total = 0;
    if (nums.length == 0) {
      return 0;
    }
    for (int i = 1; i < nums.length; i++) {
      if (!(nums[i] == 13 || nums[i - 1] == 13)) {
        total += nums[i];
      }
    }
    if (nums[0] == 13) {
      return total;
    }
    return total + nums[0];
  }


  
}
