import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15829 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long result = 0;
        long M = 1234567891;
        long r = 31;
        long pow = 1;

        String string = br.readLine();
        for (char ch : string.toCharArray()) {
            long temp = ch - 'a' + 1;
            temp = (temp * pow) % M;
            result = (result + temp) % M;
            pow = (pow * r) % M;
        }
        System.out.println(result);
    }
}
