import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14626 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        char[] arr = br.readLine().toCharArray();
        boolean flag = true;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '*') {
                if (i % 2 == 0) {
                    flag = false;
                } else {
                    flag = true;
                }
            } else {
                if (i % 2 == 0) {
                    sum += (arr[i] - '0');
                } else {
                    sum += (arr[i] - '0') * 3;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < 10; i++) {
                if ((sum + (i * 3)) % 10 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {
                if ((sum + i) % 10 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}