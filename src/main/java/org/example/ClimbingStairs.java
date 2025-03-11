package org.example;

public class ClimbingStairs {

  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    int x = 1;
    int y = 2;
    int ans = 0;
    for (int i = 3; i <= n; i++) {
      ans = x + y;
      x = y;
      y = ans;
    }
    return ans;
  }
}
