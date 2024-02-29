import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Main {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {

            Map<Integer,Integer> map = new HashMap<>();

            int n = sc.nextInt();

            int[] key1 = new int[n];
            int[] value1 = new int[n];

            for (int i = 0; i < n; i++) {
                key1[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                value1[i] = sc.nextInt();
            }

            for (int i = 0;i<n;i++) {
                if (value1[i]>0) {
                    if (map.containsKey(key1[i])) {
                        int prev = map.get(key1[i]);
                        if (prev<value1[i]) {
                            map.put(key1[i],value1[i]);
                        }
                    } else map.put(key1[i],value1[i]);
                }
            }
            int ans = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                Integer value = entry.getValue();
                ans = ans + value;
            }

            System.out.println(ans);

        }
    }
}