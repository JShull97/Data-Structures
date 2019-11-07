/**
* Program: Counter Sort Random Testing
* Developer: Justin Shull
* Date: 9/26/19
* Purpose: Test the counter sort I wrote with large arrays
*/

public class CounterSortRandomTesting {
    static int arrayIndex = 0;
    static int arrayCount = 0;
    static int[] randArray = new int[100000];
    static int[] countArray =  new int[10];

    public static void main(String[] args) {
        System.out.println("Sorting Arrays...");
        for (int i = 0; i < 1000; i++) {
            fillRandomArray(randArray);
            countValues(randArray);
            sortArray(randArray);
            clearCounts();
            checkSort(randArray);
        }
        System.out.println("Arrays sorted correctly: " + arrayCount);
    }

    public static void fillRandomArray(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.floor(Math.random() * 10);     
        }
    }

    public static void sortArray(int[] arrayToSort) {
        for (int i = 0; i <= 9; i++) {
            switch (i) {
                case 0: 
                    rewriteArray(countArray[0], 0, arrayToSort);
                    break;
                case 1: 
                    rewriteArray(countArray[1], 1, arrayToSort);
                    break;
                case 2: 
                    rewriteArray(countArray[2], 2, arrayToSort);
                    break;
                case 3: 
                    rewriteArray(countArray[3], 3, arrayToSort);
                    break;
                case 4: 
                    rewriteArray(countArray[4], 4, arrayToSort);
                    break;
                case 5: 
                    rewriteArray(countArray[5], 5, arrayToSort);
                    break;
                case 6: 
                    rewriteArray(countArray[6], 6, arrayToSort);
                    break;
                case 7: 
                    rewriteArray(countArray[7], 7, arrayToSort);
                    break;
                case 8: 
                    rewriteArray(countArray[8], 8, arrayToSort);
                    break;
                case 9: 
                    rewriteArray(countArray[9], 9, arrayToSort);
                    break;
            }
        }
    }

    public static void countValues(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {          
            switch (arrayToSort[i]) {
                case 0:
                    countArray[arrayToSort[i]]++; //switch case gave me arrayindexoutofboundsexception here
                    break;
                case 1:
                    countArray[arrayToSort[i]]++;
                    break;
                case 2:
                    countArray[arrayToSort[i]]++;
                    break;
                case 3:
                    countArray[arrayToSort[i]]++;
                    break;
                case 4:
                    countArray[arrayToSort[i]]++;
                    break;
                case 5:
                    countArray[arrayToSort[i]]++;
                    break;
                case 6:
                    countArray[arrayToSort[i]]++;
                    break;
                case 7:
                    countArray[arrayToSort[i]]++;
                    break;
                case 8:
                    countArray[arrayToSort[i]]++;
                    break;
                case 9:
                    countArray[arrayToSort[i]]++;
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void rewriteArray(int countNum, int fillNum, int[] arrayToSort) {
        for (int i = 0; i < countNum; i++) {
            arrayToSort[arrayIndex] = fillNum;
            arrayIndex++;
        }
    }

    public static boolean checkSort(int[] arrayToCheck) {
        for (int i = 0; i < arrayToCheck.length - 1; i++) {
            if (arrayToCheck[i] > arrayToCheck[i + 1]) {
                System.out.println("Array not sorted correctly");
                return false;
            }
        } 
        arrayCount++;
        return true; 
    }

    public static void clearCounts() {
        for (int i = 0; i < 10; i++) {
            countArray[i] = 0;
        }
        arrayIndex = 0;
    }
}
