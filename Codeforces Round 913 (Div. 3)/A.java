import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String pos = sc.nextLine();
            int x = pos.charAt(0);
            int y = 96;
 
            List<String> list = new ArrayList<>();
 
            for (int i = 1; i < 9; i++) {
                char ans1 = (char)x;
                String ans = ans1+""+i;
                String secondAns = (char)(y+i)+""+pos.charAt(1);
                if (!ans.equals(pos)) {
                    list.add(ans);
 
                }
                if (!secondAns.equals(pos)) {
                    list.add(secondAns);
                }
 
            }
 
            for(String ans:list) {
                System.out.println(ans);
            }
 
        }
    }
}