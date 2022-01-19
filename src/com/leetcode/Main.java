package com.leetcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String[] word = {"flower","flow","flight"};
        System.out.println(lcp.longestCommonPrefix(word));
    }
}
