import java.util.Scanner;

class Main {
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	int n = sc.nextInt();

	// 	int[] arr = new int[n];

	// 	int max = Integer.MIN_VALUE;
	// 	int min = Integer.MAX_VALUE;


	// 	int min_pos = -1;
	// 	int max_pos = -1;

	// 	for (int i = 0;i<n;i++) {
	// 		arr[i] = sc.nextInt();
	// 		if (arr[i]>=max) {
	// 			max = arr[i];
	// 			max_pos = i;
	// 		}
	// 		if (arr[i]<=min) {
	// 			min = arr[i];
	// 			min_pos = i;
	// 		}
	// 	}

	// 	int ans_max = max_pos-0;
	// 	int ans_min = (n-1)-min_pos;
	// 	// System.out.println(ans_max+ans_min);

	// 	if (max_pos > min_pos) {
    //         System.out.println(ans_max + ans_min - 1);
    //     } else {
    //         System.out.println(ans_max + ans_min);
    //     } 

	// }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
            if (heights[i] <= heights[minIndex]) {
                minIndex = i;
            }
        }

        int moves = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex) {
            moves--; 
        }

        System.out.println(moves);

        scanner.close();
    }
}