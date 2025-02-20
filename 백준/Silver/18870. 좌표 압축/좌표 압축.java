import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] x = new int[num];
        int[] sortedX = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            x[i] = Integer.parseInt(st.nextToken());
            sortedX[i] = x[i];  // 원본 데이터 복사
        }

        // **배열 정렬 (기존 방법보다 빠름)**
        Arrays.sort(sortedX);

        // **HashMap으로 좌표 압축 (값 -> 인덱스 매핑)**
        Map<Integer, Integer> indexMap = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < num; i++) {
            if (!indexMap.containsKey(sortedX[i])) {  // 중복 방지
                indexMap.put(sortedX[i], rank++);
            }
        }

        // **출력 (BufferedWriter 사용)**
        for (int i = 0; i < num; i++) {
            bw.write(indexMap.get(x[i]) + " ");
        }
        bw.flush();
        bw.close();
    }
}
