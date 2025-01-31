package dec31stpractice;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;
import java.util.List;

public class ListProgram4 {

    //Given a list of integers,check if any sublist within it is a palindrome using java
    // Example:Input:[1,2,3,2,1,4], Output: true(sublist{1,2,3,2,1} is a palindrome)

    public static boolean hasPalindromicSublist(List<Integer> list) {

        int n = list.size();

        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                List<Integer> sublist = list.subList(start, end);
                if (isPalindrome(sublist)) {
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean isPalindrome(List<Integer> sublist) {

        int left = 0, right = sublist.size() - 1;

        while (left < right) {
            if (!sublist.get(left).equals(sublist.get(right)))
            {
                return false;
            }
                left++;
                right--;
            }
           return true;
       }

    public static void main(String[] args) {

        List<Integer> input= Arrays.asList(1,2,3,2,1,4);
        boolean result = hasPalindromicSublist(input);
        System.out.println(result);
    }

    }







