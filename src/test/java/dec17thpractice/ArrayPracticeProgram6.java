package dec17thpractice;

public class ArrayPracticeProgram6 {

    public class CountInversions {
        // Method to count inversions in an array
        public static int countInversions(int[] arr) {
            if (arr == null || arr.length < 2) {
                return 0; // No inversions possible
            }
            return mergeSortAndCount(arr, 0, arr.length - 1);
        }

        // Merge sort and count inversions
        private static int mergeSortAndCount(int[] arr, int left, int right) {
            int inversions = 0;
            if (left < right) {
                int mid = left + (right - left) / 2;

                // Count inversions in left half
                inversions += mergeSortAndCount(arr, left, mid);
                // Count inversions in right half
                inversions += mergeSortAndCount(arr, mid + 1, right);

                // Count split inversions and merge
                inversions += mergeAndCount(arr, left, mid, right);
            }
            return inversions;
        }

        // Merge two halves and count split inversions
        private static int mergeAndCount(int[] arr, int left, int mid, int right) {
            int[] leftArray = new int[mid - left + 1];
            int[] rightArray = new int[right - mid];

            // Copy data to temporary arrays
            System.arraycopy(arr, left, leftArray, 0, mid - left + 1);
            System.arraycopy(arr, mid + 1, rightArray, 0, right - mid);

            int i = 0, j = 0, k = left, inversions = 0;

            // Merge the arrays and count inversions
            while (i < leftArray.length && j < rightArray.length) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k++] = leftArray[i++];
                } else {
                    arr[k++] = rightArray[j++];
                    inversions += (leftArray.length - i); // Count inversions
                }
            }

            // Copy remaining elements
            while (i < leftArray.length) {
                arr[k++] = leftArray[i++];
            }
            while (j < rightArray.length) {
                arr[k++] = rightArray[j++];
            }

            return inversions;
        }

        public static void main(String[] args) {
            int[] array = {8, 4, 2, 1};
            int inversionCount = countInversions(array);
            System.out.println("Number of inversions: " + inversionCount); // Output: 6
        }
    }

}
