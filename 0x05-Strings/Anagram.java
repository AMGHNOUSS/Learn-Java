
// Check if a given string is an anagram of another string.

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        int count1 = str1.length(), count2 = str2.length(), cm = 0;
        if (count1 != count2)
            System.out.println(str1 + ", " + str2 +" are not anagram.");
        else {
            for (int i = 0; i < count1; i++) {
                for (int j = 0; j < count2; j++) {
                    if (str1.charAt(i) == str2.charAt(j))
                        cm++;
                }
            }
            if (cm == count1)
                System.out.println(str1 + ", " + str2 +" are anagram.");
            else
                System.out.println(str1 + ", " + str2 +" are not anagram.");
        }
    }
}
