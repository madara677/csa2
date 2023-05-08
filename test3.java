package CSA2;

public class test3 {
    public static void main(String[] args) {
    String a = "123456789012345678901234567890";
    String b = "987654321098765432109876543210";
    String c = getSum(a, b);
    System.out.println(c); // 1111111111111111111111111111110
}


public static String getSum(String a, String b) {
        int[] la = new int[a.length()];
        int[] lb = new int[b.length()];
        int[] lc = new int[Math.max(a.length(), b.length()) + 1];
        for (int i = 0; i < a.length(); i++) {
        la[i] = a.charAt(a.length() - 1 - i) - '0';
        }
        for (int i = 0; i < b.length(); i++) {
        lb[i] = b.charAt(b.length() - 1 - i) - '0';
        }
        int carry = 0;
        int i = 0;
        while (i < la.length || i < lb.length || carry != 0) {
        int sum = carry;
        if (i < la.length) {
        sum += la[i];
        }
        if (i < lb.length) {
        sum += lb[i];
        }
        lc[i] = sum % 10;
        carry = sum / 10;
        i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = lc.length - 1; j >= 0; j--) {
        if (j == lc.length - 1 && lc[j] == 0) {
        continue;
        }
        sb.append(lc[j]);
        }
        return sb.toString();
        }}


