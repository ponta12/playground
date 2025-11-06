import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] difficulty = new int[31];
        int n = Integer.parseInt(br.readLine());
        int startNum = (int) Math.round(n * 0.15);
        int calcNum = n - startNum * 2;
        int check = 1;
        int sum = 0;

        Arrays.fill(difficulty, 0);

        for (int i = 0; i < n; i++) {
            difficulty[Integer.parseInt(br.readLine())]++;
        }

        while(difficulty[check] == 0) {
            check++;
            if (check > 30) break;
        }

        for (int i = 0; i < startNum; i++) {
            difficulty[check]--;
            while(difficulty[check] == 0) {
                check++;
                if (check > 30) break;
            }
        }

        for (int i = 0; i < calcNum; i++) {
            sum += check;
            difficulty[check]--;
            while(difficulty[check] == 0) {
                check++;
                if (check > 30) break;
            }
        }

        System.out.println((int) Math.round(sum / (double) calcNum));
    }
}
