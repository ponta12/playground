import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] check = new int[20000001];
        int m;

        for (int i = 0; i < check.length; i++) {
            check[i] = 0;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            check[Integer.parseInt(st.nextToken()) + 10000000]++;
        }

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            System.out.print(check[Integer.parseInt(st.nextToken()) + 10000000] + " ");
        }
        System.out.println();
    }
}
