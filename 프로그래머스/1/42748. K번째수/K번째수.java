import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++) {
            int size = commands[i][1]-commands[i][0]+1;
            int [] sorted = new int [size];
            for  (int j=0; j<size; j++) {
                sorted[j] = array[j+commands[i][0]-1];
            }
            Arrays.sort(sorted);
            answer[i] = sorted[commands[i][2]-1];
        }
        return answer;
    }
}