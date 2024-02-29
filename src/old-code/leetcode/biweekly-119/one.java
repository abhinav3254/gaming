import java.util.Arrays;

public class One {

    public static void main(String[] args) {
        int[] arr = new int[] {4,3,2,3,1};
        int[] num2 = new int[] {2,2,5,2,3,6};

        One one = new One();

        int[] ans = one.findIntersectionValues(arr,num2);

        System.out.println(Arrays.toString(ans));
    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int count1 = 0;

        for (int value : nums1) {
            for (int k : nums2) {
                if (value == k) {
                    count1++;
                    break;
                }
            }
        }

        int count2 = 0;

        for (int i : nums2) {
            for (int k : nums1) {
                if (i == k) {
                    count2++;
                    break;
                }
            }
        }

        int[] arr = new int[2];
        arr[0] = count1;
        arr[1] = count2;

        return arr;

    }
}
