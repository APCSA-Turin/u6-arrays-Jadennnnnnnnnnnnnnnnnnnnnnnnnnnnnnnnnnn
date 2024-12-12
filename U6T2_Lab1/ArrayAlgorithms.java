public class ArrayAlgorithms {
    private ArrayAlgorithms() {}

    public static double average(int[] numList) {
        double sum = 0;
        for (int i : numList) {
            sum += i;
        }
        return sum / numList.length;
    }

    public static int minimum(int[] numList) {
        int min = numList[0];
        for (int i : numList) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int howManyContain(String[] strList, String target) {
        int num = 0;
        for (String string : strList) {
            if (string.indexOf(target) != -1) {
                num++;
            }
        }
        return num;
    }
    
    public static String[] stringToArray(String myStr) {
        String array[] = new String[myStr.length()];
        for(int i = 0; i < myStr.length(); i++) {
            array[i] = myStr.substring(i, i + 1);
        }
        return array;
    }

    public static void introduceAdults(Person[] people) {
        for (Person person : people) {
            person.introduce();
        }
    }

    public static void reversePrint(String[] wordList) {
        for (int j = wordList.length - 1; j >= 0; j --) {
            String x = "";
            for(int i = wordList[j].length() - 1; i >= 0; i--) {
                x += wordList[j].substring(i, i + 1);
            }
            System.out.println(x);
        }
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int[] array = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            array[i] = arr1[i];
        }
        for(int j = 0; j < arr2.length; j++) {
            array[j + arr1.length] = array[j];
        }
        return array;
    }

    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }

    public static void multiplyBy(int[] numList, int multiplier) {
        for(int i = 0; i < numList.length; i++) {
            numList[i] *= multiplier;
        }
    }

    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] x = new int[numList.length];
        for(int i = 0; i < numList.length; i++) {
            int y = numList[i] * multiplier;
            x[i] = y;
        }
        return x;
    }

    public static void addExclamation(String[] wordList) {
        for(int i = 0; i < wordList.length; i++) {
            if (!(wordList[i].substring(wordList[i].length() - 1).equals("!"))) {
                wordList[i] += "!";
            }
        }
    }

    public static boolean[] isFreezing(int[] tempList) {
        boolean[] x = new boolean[tempList.length];
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i] <= 32) {
                x[i] = true;
            } else x[i] = false;
        }
        return x;
    }

    public static void shiftLeft(int[] numList) {
        int x = numList[0];
        for (int i = 1; i < numList.length; i ++) {
            numList[i - 1] = numList[i];
        }
        numList[numList.length - 1] = x;
    }

    public static void shiftRight(int[] numList) {
        int x = numList[numList.length - 1];
        for (int i = numList.length - 1; i > 0; i--) {
            numList[i] = numList[i - 1];
        }
        numList[0] = x;
    }    

    public static void reverse(int[] numList) {
        /*  int[] x = new int[numList.length];
        for (int i = 0; i < x.length; i ++) {
            x[i] = numList[i];          
        }
        for(int i = 0; i < x.length; i ++) {
            numList[numList.length - 1 - i] = x[i];
        }
        */

        for (int i = 0; i < numList.length / 2; i++) {
            int temp = numList[i];
            numList[i] = numList[numList.length - 1 - i];
            numList[numList.length - 1 - i] = temp;
        }
    }    
}
