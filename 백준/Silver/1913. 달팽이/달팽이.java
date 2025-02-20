import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  
        int search = sc.nextInt();  
        sc.close();

        int[][] array = new int[num][num];
        int x = num / 2; 
        int y = num / 2; 
        int dir = 0; 
        int steps = 1; 
        int value = 1; 

        array[x][y] = value;

        while (value < num * num) {
            for (int i = 0; i < 2; i++) {  
                for (int j = 0; j < steps; j++) { 
                    if (value == num * num) break;

                    value++;
                    switch (dir) {
                        case 0: x--; break;  // 위로 이동
                        case 1: y++; break;  // 오른쪽으로 이동
                        case 2: x++; break;  // 아래로 이동
                        case 3: y--; break;  // 왼쪽으로 이동
                    }
                    array[x][y] = value;
                }
                dir = (dir + 1) % 4;  // 방향 전환
            }
            steps++;  
        }

        int searchX = -1, searchY = -1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] == search) {
                    searchX = i + 1;  
                    searchY = j + 1;
                }
            }
            System.out.println();
        }

        System.out.println(searchX + " " + searchY);
    }
}
