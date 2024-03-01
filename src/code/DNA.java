package code;

import java.util.Scanner;

public class DNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int len = sc.nextInt();
            sc.nextLine();
            String dna = sc.nextLine();
            String newDna = "";

            for (int i = 0; i < len; i++) {
                char c = dna.charAt(i);
                switch (c) {
                    case 'A':
                        newDna = newDna + "T";
                        break;
                    case 'T':
                        newDna = newDna + "A";
                        break;
                    case 'C':
                        newDna = newDna + "G";
                        break;
                    case 'G':
                        newDna = newDna + "C";
                        break;
                    default:
                        break;
                }
            }

            System.out.println(newDna);

        }
        sc.close();
    }
}
