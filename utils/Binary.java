import java.util.*;

class Main {

	public static void main(String[] args) {

		int num = 45;
		convertBinary(45);
	}


	public static void convertBinary(int num) {

		List<Integer> list = new ArrayList<>();

		while (num>0) {
			int bin = num%2;
			num = num/2;
			list.add(bin);
		}

		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i));
		}

	}
	
}