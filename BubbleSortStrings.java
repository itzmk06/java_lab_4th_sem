public class BubbleSortStrings {
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "cherry", "date", "fig"};

        System.out.println("Original array:");
        for (String s : arr) {
            System.out.print(s + " ");
        }

        bubbleSort(arr);   

        System.out.println("\nSorted array:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
