import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int numItem, possibleWeight;
        numItem = Integer.parseInt(st.nextToken());
        possibleWeight = Integer.parseInt(st.nextToken());

        int[][] items = new int[numItem+1][2];
        int[][] dpSum = new int[numItem+1][possibleWeight+1];

        for (int i = 1; i <= numItem; i++) {
            st = new StringTokenizer(br.readLine());
            items[i][0] = Integer.parseInt(st.nextToken());
            items[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= numItem; i++) {
            for (int j = 1; j <= possibleWeight; j++) {
                if (j < items[i][0]) {
                    dpSum[i][j] = dpSum[i-1][j];
                }
                else {
                    dpSum[i][j] = Math.max(dpSum[i-1][j], dpSum[i-1][j - items[i][0]] + items[i][1]);
                }
            }
        }

        System.out.println(dpSum[numItem][possibleWeight]);
    }
}
