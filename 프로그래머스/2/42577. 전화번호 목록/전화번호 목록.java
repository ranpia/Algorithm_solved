import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {

        HashSet<String> map = new HashSet<>();
        map.addAll(Arrays.asList(phone_book));

        boolean answer = true;
        
        for (String s : phone_book) {
            for (int i=0; i<s.length(); i++) {
                if (map.contains(s.substring(0, i))){
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}