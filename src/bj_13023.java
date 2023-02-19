import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class bj_13023 {
    static List<Integer>[] num;
    static boolean vis[];
    static boolean arrive;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        num = new ArrayList[n];
        vis = new boolean[n];
        for (int i = 0; i < n;i++){
            num[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m ; i++){
            st = new StringTokenizer(br.readLine());

            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            num[f].add(s);
            num[s].add(f);

        }

        for (int i = 0; i < n; i++){
            dfs(i,1);
            if (arrive){
                break;
            }
        }
        if (arrive)
            System.out.println(1);
        else
            System.out.println(0);
    }

    private static void dfs(int i, int depth) {

        if (depth == 5 || arrive){
            arrive = true;
            return;
        }
        vis[i] =true;
        for (int j : num[i])
            if (!vis[j]) {
                dfs(j, depth + 1);
            }
        vis[i] = false;
    }

}
