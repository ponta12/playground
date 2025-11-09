import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        Arrays.fill(arr, 0);
        int sum = 0;
        int mid = 0;
        int avg, many, min, max;
        int check = 0;
        int checkNum = 0;
        min = 4001;
        max = -4001;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[num + 4000]++;
        }
        
        for (int i = 0; i < 8001; i++) {
            if (arr[i] != 0) {
                min = Math.min(min, i - 4000);
                max = Math.max(max, i - 4000);
                check = Math.max(check, arr[i]);
                for (int j = 0; j < arr[i]; j++) {
                    checkNum++;
                    if (checkNum == n / 2 + 1) {
                        mid = i - 4000;
                    }
                }
            }
        }

        for (int i = 0; i < 8001; i++) {
            if (arr[i] == check) {
                numbers.add(i - 4000);
            }
        }

        if (numbers.size() == 1) {
            many = numbers.get(0);
        } else {
            many = numbers.get(1);
        }

        avg = (int) Math.round((double) sum / n);

        System.out.println(avg);
        System.out.println(mid);
        System.out.println(many);
        System.out.println(max - min);
    }
}