package CSA2;

public class test5 {
    public static void main(String[] args) {
        String[] strs = {"acbde", "acbder", "acbduuu"};
        String longestCommonPrefix = findLongestCommonPrefix(strs);
        System.out.println(longestCommonPrefix); // 输出 "fl"
    }

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

