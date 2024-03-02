package GFG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Common {

    public static List<String> commonChars(String[] words) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : words[0].toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> w = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                w.put(c, w.getOrDefault(c, 0) + 1);
            }
            counts.keySet().retainAll(w.keySet());
            for (char c : counts.keySet()) {
                counts.put(c, Math.min(counts.get(c), w.get(c)));
            }
        }

        List<String> res = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int j = 0; j < count; j++) {
                res.add(Character.toString(c));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String words[] = { "bella", "label", "roller" };
        List<String> str = commonChars(words);
        for (String c : str) {
            System.out.println(c);
        }
    }
}
