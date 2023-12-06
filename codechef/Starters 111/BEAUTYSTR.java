import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		while (t-->0) {
		    String size = sc.nextLine();
			String str = sc.nextLine();
			
			ArrayList<String> list = findSubstringsWithFrequencyCondition(str);
			System.out.println(list.size());
		}
		sc.close();
	}

	public static ArrayList<String> findSubstringsWithFrequencyCondition(String str) {
        ArrayList<String> result = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<Character, Integer> sFreq = new HashMap<>();
        
        // Calculate frequency of characters in string 'S'
        for (char ch : str.toCharArray()) {
            sFreq.put(ch, sFreq.getOrDefault(ch, 0) + 1);
        }
        
        for (int start = 0; start < str.length(); start++) {
            for (int end = start + 1; end <= str.length(); end++) {
                String substring = str.substring(start, end);
                
                // Check the frequency condition for each substring
                if (!set.contains(substring) && checkFrequency(substring, sFreq)) {
                    result.add(substring);
                    set.add(substring);
                }
            }
        }
        return result;
    }

    public static boolean checkFrequency(String substring, HashMap<Character, Integer> sFreq) {
        HashMap<Character, Integer> subFreq = new HashMap<>();
        
        // Calculate frequency of characters in the substring
        for (char ch : substring.toCharArray()) {
            subFreq.put(ch, subFreq.getOrDefault(ch, 0) + 1);
        }
        
        // Check frequency condition for each character in the substring
        for (char ch : subFreq.keySet()) {
            if (!sFreq.containsKey(ch) || subFreq.get(ch) > sFreq.get(ch)) {
                return false;
            }
        }
        return true;
    }
}


