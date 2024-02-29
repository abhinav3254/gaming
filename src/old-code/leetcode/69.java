class Main {
	public static void main(String[] args) {
		System.out.println(mySqrt(8));
		System.out.println(mySqrt(16));
		System.out.println(mySqrt(19));
		System.out.println(mySqrt(22));
		System.out.println(mySqrt(34));
		System.out.println(mySqrt(67));
		System.out.println(mySqrt(117171717));
		System.out.println(mySqrt(78));
		System.out.println(mySqrt(111));
	}
	public static int mySqrt(int x) {
        if (x == 0 || x == 1) { return x; }
        int start = 1;
        int end = x;

        while (start<=end) {
        	int mid = start+(end-start)/2;

        	if ((long)mid*mid == (long)x) {
        		return mid;
        	} else if ((long)mid*mid>(long)x) {
        		// left side
        		end = mid - 1;
        	} else {
        		// right side
        		start = mid + 1;
        	}
        }

        return end;
    }
}