import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0 ;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        for (int k = 0; k<N;k++){
            int find = arr[k];
            int i = 0;
            int j = N-1;

            while (i<j){
                if (arr[i] + arr[j] == find) {

                    if (i != k & j != k){
                        count++;
                        break;
                    }
                    else if (i == k){
                        i++;
                    }
                    else if ( j == k){
                        j--;
                    }
                }

                else if (arr[i] + arr[j] > find){
                    j--;
                }
                else {
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}
