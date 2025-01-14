/*Majority Element II
You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array.

Note: The answer should be returned in an increasing format.

        Examples:

Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.
        Input: arr[] = [1, 2, 3, 4, 5]
Output: []
Explanation: o candidate occur more than n/3 times.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findTheMajorityElement {
    public List<Integer> findMajority(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int elem1=0;
        int elem2=0;
        int count1=0;
        int count2=0;
        int n=nums.length;

        for(int x : nums){
            if(x==elem1){
                count1++;
            }else if(x==elem2){
                count2++;
            }else if(count1==0){
                elem1=x;
                count1++;
            }else if(count2==0){
                elem2=x;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;

        for(int x : nums){
            if(elem1==x){
                count1++;
            }else if(elem2==x){
                count2++;
            }
        }

        if(count1>n/3){
            ans.add(elem1);
        }
        if(count2>n/3){
            ans.add(elem2);
        }

        if(ans.size()==2 && ans.get(0)>ans.get(1)){
            Collections.swap(ans, 0, 1);
        }
        return ans;



        /*ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        int val = n/3;

        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer, Integer> value : map.entrySet()){
            if(value.getValue()>val){
                ans.add(value.getKey());
            }
        }
        return ans;*/
    }
}
