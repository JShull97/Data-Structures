/**
* Program: Counter Sort
* Developer: Justin Shull
* Date: 9/20/19
* Purpose: Sort an array through tallying the values and placing those values back in numerical order
*/
import java.util.Arrays;

public class CounterSort {
    static int arrayIndex = 0;
    static int[] allSame = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] alreadySorted = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3,
                                  3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6,
                                  6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
    static int[] reverseSorted = {9, 9, 9, 9, 9, 8, 8, 8, 8, 8, 7, 7, 7, 7, 7, 6, 6,
                                  6, 6, 6, 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 3, 3, 3, 3,
                                  3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
    static int[] randArray = new int[50];
    static int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0,
               count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
    public static void main(String[] args) {
        fillRandomArray(randArray);
        startSort(allSame, "All same array");
        startSort(alreadySorted, "Already sorted array");
        startSort(reverseSorted, "Reverse sorted array");
        startSort(randArray, "Random array");
    }

    public static void fillRandomArray(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.floor(Math.random() * 10);     
        }
    }

    public static void startSort(int[] arrayToSort, String name) {
        countValues(arrayToSort);
        sortArray(arrayToSort);
        System.out.println("Is "+ name + " sorted?: " + checkSort(arrayToSort));
        //System.out.println(Arrays.toString(arrayToSort)); // For visual inspection if wanted
        clearCounts();
    }

    public static void sortArray(int[] arrayToSort) {
        for (int i = 0; i <= 9; i++) { // makes the timing quadratic but I didn't want to write 10 seperate loops for each num
            switch (i) {
                case 0: 
                    rewriteArray(count0, 0, arrayToSort);
                    break;
                case 1: 
                    rewriteArray(count1, 1, arrayToSort);
                    break;
                case 2: 
                    rewriteArray(count2, 2, arrayToSort);
                    break;
                case 3: 
                    rewriteArray(count3, 3, arrayToSort);
                    break;
                case 4: 
                    rewriteArray(count4, 4, arrayToSort);
                    break;
                case 5: 
                    rewriteArray(count5, 5, arrayToSort);
                    break;
                case 6: 
                    rewriteArray(count6, 6, arrayToSort);
                    break;
                case 7: 
                    rewriteArray(count7, 7, arrayToSort);
                    break;
                case 8: 
                    rewriteArray(count8, 8, arrayToSort);
                    break;
                case 9: 
                    rewriteArray(count9, 9, arrayToSort);
                    break;
            }
        }
    }

    public static void countValues(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {          
            if (arrayToSort[i] == 0) count0++; //switch case gave me arrayindexoutofboundsexception here
            else if (arrayToSort[i] == 1) count1++;
            else if (arrayToSort[i] == 2) count2++;
            else if (arrayToSort[i] == 3) count3++;
            else if (arrayToSort[i] == 4) count4++;
            else if (arrayToSort[i] == 5) count5++;
            else if (arrayToSort[i] == 6) count6++;
            else if (arrayToSort[i] == 7) count7++;
            else if (arrayToSort[i] == 8) count8++;
            else if (arrayToSort[i] == 9) count9++;
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
            if (arrayToCheck[i] > arrayToCheck[i + 1]) return false;
        }      
        return true; 
    }

    public static void clearCounts() {
        count0 = 0; count1 = 0; count2 = 0;
        count3 = 0; count4 = 0; count5 = 0;
        count6 = 0; count7 = 0; count8 = 0;
        count9 = 0; arrayIndex = 0;
    }
}
