import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Queue<Integer> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int temp;
        String answer = "<";

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {
            for (int i = 1; i <= M; i++) {
                temp = queue.poll();
                if (i == M) {
                    answer += temp + "";
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        answer += ", ";
                    }
                } else {
                    queue.offer(temp);
                }
            }
        }

        answer += ">";
        System.out.println(answer);
    }
}
