import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class bj_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int seconds_abs = Math.abs(o2);
            if (first_abs ==seconds_abs){
                return o1 > o2 ? 1 : -1;
            }
            else {
                return first_abs - seconds_abs;
            }
        }));

        for (int i = 0; i< n; i++){
            int request = Integer.parseInt(br.readLine());
            if (request == 0){
                if (queue.isEmpty()){
                    System.out.println("0");
                }
                else {
                    System.out.println(queue.poll());
                }
            }
            else
            {
                queue.add(request);
            }
        }
    }
}
