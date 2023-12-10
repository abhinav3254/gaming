import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        String[][] arr = new String[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.next();

                if (arr[i][j].equals("C") || arr[i][j].equals("M") || arr[i][j].equals("Y")) {
                    System.out.println("#Color");
                    return;
                }
            }
        }
        System.out.println("#Black&White");
    }
}
