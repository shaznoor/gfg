/*Next Permutation
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order).

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

        Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.
Input: arr = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.
Input: arr = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
Explanation: The next permutation of the given array is {3, 4, 5, 1, 2}.*/

public class nextPermutations {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        //int[] arr = {3, 2, 1};
        nextPermutation(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    static void nextPermutation(int[] arr) {
        int n=arr.length;
        int pivot=-1;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                pivot=i-1;
                break;
            }
        }

        if(pivot==-1){
            reverse(arr, 0);
        }else{
            for(int i=n-1;i>pivot;i--){
                if(arr[i]>arr[pivot]){
                    int temp=arr[i];
                    arr[i]=arr[pivot];
                    arr[pivot]=temp;
                    break;
                }
            }
            reverse(arr, pivot+1);
        }
    }

    static void reverse(int[] arr, int start){
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}