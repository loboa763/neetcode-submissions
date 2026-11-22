class Solution {
    public int lengthOfLastWord(String word) {
        int count = 0;
        for(int i = word.length()-1; i>=0; i--){
            if(word.charAt(i) == ' ' && count == 0){
                continue;
            }
            if(word.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}