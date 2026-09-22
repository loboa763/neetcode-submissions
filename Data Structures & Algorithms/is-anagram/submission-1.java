class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }
    for(int i = 0; i<s.length(); i++){
        char s_word = s.charAt(i);
        for(int j = 0; j<t.length(); j++){
            char t_word = t.charAt(j);
            if(s_word == t_word){
                t = t .substring(0,j)+t.substring(j+1);
                break;
            }
        }
    }
    if(t.length()!=0){
        return false;
    }
        return true;
    }
}
