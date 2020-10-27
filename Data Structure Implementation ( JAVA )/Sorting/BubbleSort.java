/// Sort an array using Bubble sort Algorithm

// Time Complexity  => O(n^2)
// Space Complexity => O(1)

public class BubbleSort {
    public static void main(String[] args) {

        int[] list = { 64, 3, 45, 3, 1, 75, 30 };
        int[] sortedList = bubbleSort(list);
        for (int n : sortedList) {
            System.out.print(n + " "); // Output => 1 3 3 30 45 64 75
        }
    }

    static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                // if first greater then swap else not
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}