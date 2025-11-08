import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main28702 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int target = 0;
        for (int i = 3; i > 0; i--) {
            String line = br.readLine();
            if (!line.equals("Fizz")
                && !line.equals("Buzz" )
                && !line.equals("FizzBuzz")) {
                target = Integer.parseInt(line) + i;
            }
        }

        if (target % 3 == 0 && target % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (target % 3 == 0) {
            System.out.println("Fizz");            
        } else if (target % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(target);
        }
    }
}
