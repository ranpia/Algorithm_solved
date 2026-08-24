import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int answer = nums.length/2;

        if (map.size()<answer){
            answer = map.size();
        }

        return answer;
    }
}