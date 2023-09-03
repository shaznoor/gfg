/*
Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.
Example 1:

Input:
nums = {2, 8, 5, 4}
Output:1
Explaination:
swap 8 with 4.
Example 2:

Input:
nums = {10, 19, 6, 3, 5}
Output:2
Explaination:
swap 10 with 3 and swap 19 with 5.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
class MinimumSwapstoSort
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            int ans = minSwaps(nums);
            System.out.println(ans);
        }
    }

    public static int minSwaps(int nums[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=i){
                ans++;
                swap(i,map.get(nums[i]),nums);
                i--;
            }
        }
        return ans;
    }

    static void swap(int x, int y, int[] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}
