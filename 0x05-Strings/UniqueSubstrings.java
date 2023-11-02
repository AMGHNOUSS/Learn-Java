
public class UniqueSubstrings {
    public static void main(String[] args) {
        String str = "abcd";
        findUniqueSubstrings(str);
    }

    // Method to find and print all unique substrings of a given string
    public static void findUniqueSubstrings(String str) {
        
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
