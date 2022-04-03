package port1KMP;

public class KMP {
    public static void main(String[] args) {
        System.out.println(getIndexOf("assssssssfffff", "sssssssss"));
    }


    /**
     *KMP 算法
     */
    public static int getIndexOf(String s, String m) {
        if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
            return -1;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = m.toCharArray();
        int i1 = 0;
        int i2 = 0;
        int[] next = getNextArray(str2);
        while (i1 < str1.length && i2 < str2.length) {
            if (str1[i1] == str2[i2]) {
                i1++;
                i2++;
            } else if (next[i2] == -1) {
                i1++;
            } else {
                //退回next数组的下一个位置
                i2 = next[i2];
            }
        }
        return i2 == str2.length ? i1 - i2 : -1;
    }

    private static int[] getNextArray(char[] str2) {
        if (str2.length == 1) {
            return new int[]{ - 1};
        }
        int[] next = new int[str2.length];
        next[0] = -1;
        next[1] = 0;
        //cn: 表示当前i字符串前一个字符串i-1 的最长前缀后缀相等的最大长度。
        int cn = 0;
        int i = 2;
        while (i < next.length) {
            if (str2[i - 1] == str2[cn]) {
                next[i++] = cn + 1;
            } else if (cn > 0) {
                //前一个字符串的最长前缀后缀相等的最大长度大于0
                cn = next[cn];
            } else {
                next[i++] = 0;
            }
        }
        return next;
    }
}
