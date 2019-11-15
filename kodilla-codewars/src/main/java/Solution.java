
class Solution {
    public static String longestWord(String wordString) {
        String[] splitStr = wordString.split("\\s+");
        int max = splitStr[0].length();
        String result = " ";
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].length() >= max) {
                max=splitStr[i].length();
                result = splitStr[i];
            }
        }

        return result;

    }
}