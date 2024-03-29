package com.learning.core.PracticeProject;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        List<Integer> longestIncreasingSubsequence = findLongestIncreasingSubsequence(nums);
        System.out.println("Longest increasing subsequence: " + longestIncreasingSubsequence);
    }

    public static List<Integer> findLongestIncreasingSubsequence(int[] nums) {
        List<List<Integer>> subsequences = new ArrayList<>();
        List<Integer> longestIncreasingSubsequence = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> currentSubsequence = new ArrayList<>();
            currentSubsequence.add(nums[i]);

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > currentSubsequence.get(currentSubsequence.size() - 1)) {
                    currentSubsequence.add(nums[j]);
                }
            }

            subsequences.add(currentSubsequence);
        }

        for (List<Integer> subsequence : subsequences) {
            if (subsequence.size() > longestIncreasingSubsequence.size()) {
                longestIncreasingSubsequence = subsequence;
            }
        }

        return longestIncreasingSubsequence;
    }
}

