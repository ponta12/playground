import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int n = 0;
        int check_num = 666;
        int ans = 0;

        while(true) {
            int cnt = 0;
            int temp = check_num;

            while(temp != 0) {
                if(temp % 1000 == 666) cnt++;
                temp /= 10;
            }

            if(cnt > 0) n++;
            if(n == num) {
                ans = check_num;
                break;
            }
            check_num++;
        }

        System.out.println(ans);
    }
}
