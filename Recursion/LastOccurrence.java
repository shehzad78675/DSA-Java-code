package Recursion;

public class LastOccurrence {
    public static int lastOccurrence(int arr[], int i, int key) {
        if (i == 0 && arr[i] != key) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return lastOccurrence(arr, i - 1, key);
    }

    public static int lastOccu(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccu(arr, i + 1, key);
        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3, 7 };
        System.out.println(lastOccu(arr, 0, 3));
    }
}
