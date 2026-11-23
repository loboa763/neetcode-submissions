class Solution {
    public int scoreOfString(String word) {
         int count = 0;
        for(int i = 1; i<word.length(); i++){
            int difference = Math.abs(word.charAt(i) - word.charAt(i-1));
            count+= difference;
        }
        return count;
    }
}