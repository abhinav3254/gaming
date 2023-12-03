class Main {
	public static void main(String[] args) {

		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

		String ans = addBinary(a,b);
		System.out.println(ans);
	}

	public static String addBinary(String a, String b) {

		long num1 = convertStringToDecimal(a);
		long num2 = convertStringToDecimal(b);

		return convertDecimalToBinary(num1+num2);
        
    }

    public static long convertStringToDecimal(String s) {
    	int count = 0;
    	long num = 0;
    	for (int i = s.length()-1;i>=0;i--) {
    		if (s.charAt(i) == '1') {
    			num = num+(long)Math.pow(2,count);
    		}
    		count++;
    	}

    	return num;
    }

    public static String convertDecimalToBinary(long num) {

    	String ans = "";

    	while (num>0) {
    		ans = ans+(num%2);
    		num = num/2;
    	}

    	return ans;

    }
}