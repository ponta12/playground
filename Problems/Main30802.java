import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int T = 0;
        st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int T1 = Integer.parseInt(st2.nextToken());
        int P1 = Integer.parseInt(st2.nextToken());

        for (int i = 0; i < 6; i++) {
            T += Math.ceil(Integer.parseInt(st.nextToken()) / (double) T1);
        }
        System.out.println(T);
        System.out.println((N / P1) + " " + (N % P1));
    }
}
