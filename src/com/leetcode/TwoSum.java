package com.leetcode;

import java.util.HashMap;

public class TwoSum {
    /* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/

    public int[] twoSum(int[] num, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++) {

            int diff = target - num[i];
            if (hash.containsKey(diff)) {
                int toReturn[] = {hash.get(diff), i};
                return toReturn;
            }
            hash.put(num[i], i);
        }

        return null;
    }
}