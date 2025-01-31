package dec17thpractice;

public class ArrayPracticeProgram2 {

    //Write a method that returns the first non-repeating element in an array. If all elements are
    //repeated , return -1. Example:For input [4,5,4,5,3,2,3,8]

    public static void main(String[] args) {

        int[] arr = {4,5,8,5,3,2,3,2,8};

        int result = firstNonrepeatingelement(arr);

        System.out.println(result);

    }

    public static int firstNonrepeatingelement(int[] arr) {


        int n = arr.length;

        for (int i = 0; i < n; i++) {

            boolean isRepeated = false;

            //check if the current element is repeated in the array
            for (int j = 0; j < n; j++) {

                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }

               //if the element is non-repeated return it
                if (!isRepeated) {
                    return arr[i];
                }


            }
        //if non-repeating element is foung return -1

            return -1;
        }
    }












