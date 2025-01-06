package org.example;

import java.util.HashMap;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int addition = target - nums[i];

      if (map.containsKey(addition)) {
        return new int[]{map.get(addition), i};
      }
      map.put(nums[i], i);
    }
    return new int[]{0};
  }
}
