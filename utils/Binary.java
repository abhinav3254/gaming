import java.util.*;

class Main {

	public static void main(String[] args) {

		int num = 45;
		List<Integer> list = convertBinary(45);

		convertBinaryToDecimal(list);
	}


	public static List<Integer> convertBinary(int num) {

		List<Integer> list = new ArrayList<>();

		while (num>0) {
			int bin = num%2;
			num = num/2;
			list.add(bin);
		}

		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i));
		}

		System.out.println();

		return list;

	}

	public static void convertBinaryToDecimal(List<Integer> list) {
		double ans = 0;
		for(int i = 0;i<list.size();i++) {
			ans = ans+list.get(i)*Math.pow(2,i);
		}

		System.out.print(ans);
	}
	
}