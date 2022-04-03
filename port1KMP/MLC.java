package port1KMP;

/**
 *
 * 马拉车
 *
 */
public class MLC {
    public static void main(String[] args) {
        System.out.println(longestSubString("babad"));
    }

    public static String preProcess(String str) {
        int n = str.length();
        if (n == 0) {
            return "^$";
        }
        String ret = "^";
        for (int i = 0; i < n; i++) {
            ret += "#" + str.charAt(i);
        }
        ret += "#$";
        return ret;
    }

    //malache算法
    public static String longestSubString(String str) {
        String T = preProcess(str);
        int n = T.length();
        int maxLen = 0;
        int maxCenterIndex = 0;
        int[] p = new int[n];

        //回文中心
        int C = 0;
        //当前循环中 R 最靠右的回文串。
        int R = 0;
        for (int i = 1; i < n - 1; i++) {
            int i_mirror = 2 * C - i;
            if (R > i) {
                p[i] = Math.min(R - i, p[i_mirror]);
            } else {
                p[i] = 0;
            }

            //中心拓展
            while (T.charAt(i + 1 + p[i]) == T.charAt(i - 1 - p[i])) {
                //半径加1
                p[i]++;
            }

            //更新C，Ｒ
            if (i + p[i] > R) {
                C = i;
                R = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenterIndex = i;
            }
        }

        //"babad"
        //#b#a#b#a#d#

        int start = (maxCenterIndex - maxLen) / 2; //最开始讲的求原字符串下标
        System.out.println(start);
        return str.substring(start, start + maxLen);
    }
}
