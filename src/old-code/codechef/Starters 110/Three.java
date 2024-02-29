import java.util.Scanner;

class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {
            int students = sc.nextInt();
            int boys = sc.nextInt();
            int groups = sc.nextInt();

            int girls = students-boys;

            while (boys>=groups) {
                boys = boys%groups;
            }

            while (girls>=groups) {
                girls = girls%groups;
            }


            if (boys > girls && boys > 0) {
                System.out.println(boys-girls);
            } else if (girls > boys && girls > 0) {
                System.out.println(girls-boys);
            } else {
                System.out.println(0);
            }

        }
    }
}