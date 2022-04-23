package 算法学习代码;

/**
 * 约瑟夫环问题
 *
 * 函数关系
 * 字符串匹配问题
 *  给定字符串str，其中不含有字符串.和*。再给定字符串exp，
 *  其中可以含有.和*，*不能是exp的首字符。并且任意两个字符串不相邻。
 *  exp中.可以代表任意一个字符。*可以表示匹配0或多个。 请编写一个函数。
 *  判断str是否可以被exp匹配。
 */
public class Code0419 {
    public static void main(String[] args) {
        System.out.println(isExpct("fd", ".****fd"));
    }

    /**
     * 是否可以被匹配
     * @param str
     * @param exp
     * @return
     */
    public static boolean isExpct(String str, String exp) {
        return isExpctSub(str.toCharArray(), exp.toCharArray(), 0, 0);
    }

    /**
     * str[i...] 能否匹配exp[j...]
     * @param str
     * @param exp
     * @param i
     * @param j
     * @return
     */
    public static boolean isExpctSub(char[] str, char[] exp, int i, int j) {
        if (j == exp.length) {
            return  i == str.length;
        }

        //exp下一个字符串不是*
        if (j + 1 == exp.length || exp[j + 1] != '*') {
            return i != str.length && (exp[j] == str[i] || exp[j] == '.') && isExpctSub(str, exp, i + 1, j + 1);
        }

        //exp的下一个字符串是*
        while (i != str.length && (exp[j] == str[i] || exp[j] == '.')) {
            if (isExpctSub(str, exp, i, j + 2)) {
                return true;
            }
            i++;
        }
        //exp {{c}} 匹配0次。
        return isExpctSub(str, exp, i, j + 2);
    }
}
