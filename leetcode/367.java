class Solution {
    public boolean isPerfectSquare(int num) {

        // here complexity is O(n)
        // for (int i = 2;i<num;i++) {
        //     if (i*i == num) return true;
        // }
        // return false;
        return binaryWay(num);
    }

    public boolean binaryWay(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long)mid * mid;

            if (square == n) {
                return true;
            } else if (square < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

}