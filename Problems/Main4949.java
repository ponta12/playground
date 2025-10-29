import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            String string = br.readLine();
            Stack<Character> stack = new Stack<>();
            String ans = "yes";
            if (string.equals(".")) break;

            for (char c : string.toCharArray()) {
                if(c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        ans = "no";
                        break;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        ans = "no";
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty()) {
                        ans = "no";
                        break;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        ans = "no";
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                ans = "no";
            }

            System.out.println(ans);
        }
    }
}
