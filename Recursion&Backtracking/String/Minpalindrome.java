package String;

public class Minpalindrome {

    public static int minChar(String str) {
        // Write your code here

        // revesrse String
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        StringBuilder st = new StringBuilder();
        st.append(sb);
        st.append('$');
        st.append(str);

    }

    public static void main(String[] args) {

    }
}
