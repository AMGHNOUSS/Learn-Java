
/*
 * Generate all possible permutations of a given string.
 */

import java.util.ArrayList;
import java.util.List;

public class PossiblePermutations {
    public static void main(String[] args) {
        String txt = "abc";
        System.out.println("all possible permutations of \"" + txt + "\" : " + generatePermutations(txt));
    }

    public static List < String > generatePermutations(String str) {
        List < String > permutations = new ArrayList < > ();
        generatePermutationsHelper(str, "", permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(String str, String current, List < String > permutations) {
        if (str.isEmpty()) {
            permutations.add(current);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutationsHelper(remaining, current + ch, permutations);
        }
    }
}