import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11659 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        int[] sum = new int[a+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i<=a ; i++){
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < b; i ++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.println(sum[m] - sum[n-1]);
        }



    }
}
