class Solution {
    public String longestCommonPrefix(String[] words) {
        String result = "";
        for(int i = 0; i<words[0].length(); i++){
            for(int j = 1; j<words.length; j++){
                if(i>=words[j].length()){
                    return result;
                }
                if(words[0].charAt(i) != words[j].charAt(i)){
                    return result;
                }
            }
            result += words[0].charAt(i);
        }
        return result;
    }
}