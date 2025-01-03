public class ArrayAlgorithms {
    public static String longestString(String[] stringList) {
        String str = "";
        for (String string : stringList) {
            if (string.length() > str.length()) {
                str = string;
            }
        }
        return str;
    }

    public static boolean containsPositive(int[] numList) {
        for (int num : numList) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    public static String[] makeLowercase(String[] wordList) {
        String[] words = new String[wordList.length]; 
        for (int i = 0; i < wordList.length; i++) {
            words[i] = wordList[i].toLowerCase();
        }
        return words;
    }

    public static int endsInExclamations(String[] stringList) {
        int count = 0;
        for (String string : stringList) {
            if (string.substring(string.length() - 1).equals("!")) {
                count++;
            }
        }
        return count;
    }

    public static void makeUppercase(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        int[] max = new int[intArr1.length];

        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i] > intArr2[i]) {
                max[i] = intArr1[i];
            } else max[i] = intArr2[i];
        }

        return max;
    }
    
    public static int countConsecutiveDoubles(int[] numList) {
        int count = 0;

        for (int i = 0; i < numList.length - 1; i++) {
            if (numList[i] == numList[i + 1]) {
                count++;
            }
        }

        return count;
    }
    
    public static int longestStreak(int[] nums) {
        int max = 1; int current = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                current ++;
            } else current = 1;
            if (current > max) {
                max = current;
            }
        }

        return max;
    }
    
}
