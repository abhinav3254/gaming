import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n+1];

        int p = sc.nextInt();
        int[] p_arr = new int[p];
        for(int i = 0;i<p;i++) {
            p_arr[i] = sc.nextInt();
            arr[p_arr[i]] = true;
        }

        int q = sc.nextInt();
        int[] q_arr = new int[q];
        for (int i = 0;i<q;i++) {
            q_arr[i] = sc.nextInt();
            arr[q_arr[i]] = true;
        }
        boolean flag = true;
        for (int i = 1;i<n+1;i++) {
            if (!arr[i]) {
                flag = false;
                break;
            }
//            System.out.println(arr[i]);
        }

        if (flag) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }
}