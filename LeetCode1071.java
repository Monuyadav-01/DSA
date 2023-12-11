import java.util.HashSet;

/**
 * LeetCode1071
 */
public class LeetCode1071 {

    public static String gcdOfStrings(String str1, String str2) {
        HashSet<Character> s1 = new HashSet<>();
        HashSet<Character> s2 = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            s1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            s2.add(str2.charAt(i));
        }

        for (char ele : s2) {
            if (s1.contains(ele)) {
                sb.append(ele);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str1 = "Leet";
        String str2 = "code";
        System.out.println(gcdOfStrings(str1, str2));
    }
}