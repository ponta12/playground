import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String st, temp;

        temp = br.readLine();
        num += Integer.parseInt(temp);
        st = temp;

        temp = br.readLine();
        num += Integer.parseInt(temp);
        st = st.concat(temp);

        temp = br.readLine();
        num -= Integer.parseInt(temp);
        System.out.println(num);
        System.out.println(Integer.parseInt(st) - Integer.parseInt(temp));
    }
}
