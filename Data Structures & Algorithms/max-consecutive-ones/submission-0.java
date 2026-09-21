class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int currentStreak = 0;
    int largestStreak = 0;
    for(int i = 0; i<nums.length; i++){
      if(nums[i] == 1){
        currentStreak += 1;
        if(currentStreak>largestStreak){
          largestStreak = currentStreak;
        }
      }
      else if(nums[i]!=1){
        currentStreak = 0;
      }
    }
    return largestStreak;
  }
}