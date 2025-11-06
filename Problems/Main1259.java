import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            String str = br.readLine();
            if (str.equals("0")) break;
            boolean check = true;

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.toCharArray()[i] != str.toCharArray()[str.length() - i - 1]) {
                    check = false;
                    break;
                }
            }

            if (check) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
