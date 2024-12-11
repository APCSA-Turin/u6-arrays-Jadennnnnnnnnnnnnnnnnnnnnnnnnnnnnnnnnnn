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

    
    
}
