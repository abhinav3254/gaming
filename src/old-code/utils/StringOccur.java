

class Main {

    public static void main(String[] args) {
        System.out.println(" ans :- "+strStr("sadbutsad","sad"));
    }

    public static int strStr(String haystack, String needle) {

        int count = 0;

        int index = -1;

        for(int i = 0;i<haystack.length();i++) {

            int a = haystack.charAt(i);
            int b = needle.charAt(0);

            if (a == b) {
                for (int j = 0;i<needle.length();j++) {
                    a = haystack.charAt(i+j);
                    b = needle.charAt(j);
                    if (a != b) {
                        break;
                    } else {
                        count = count + 1;
                    }
                }
            }

            if (count == needle.length()) {
                return i;
            } else {
                count = 0;
            }

        }


        return index;
        
    }
}