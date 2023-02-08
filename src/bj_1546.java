import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i< n ; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        long max = 0;
        long sum = 0;
        for (int i = 0 ; i < n ; i++){
            if (num[i] > max){
                max = num[i];
            }
            sum +=  num[i];
        }

        System.out.println(sum * 100 / max / n);
    }
}
