package String;

import java.util.*;
import java.util.Map.Entry;;

public class Anagram {

    public static boolean anagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        int[] arr = new int[26];

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            arr[b.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String a = "geeksforgaeks", b = "forgeeksgeeks";

        System.out.println(anagram(a, b));
    }
}
