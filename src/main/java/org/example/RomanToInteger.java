package org.example;

public class RomanToInteger {
    public int romanToInt(String s) {
      int ans = 0, i = 0;
      while (i < s.length()) {
        switch (s.charAt(i)) {
          case ('I'):
            if (i + 1 < s.length() && (s.charAt(i + 1) == 'V')) {
              ans += 4;
              i++;
            } else if (i + 1 < s.length() && (s.charAt(i + 1) == 'X')) {
              ans += 9;
              i++;
            } else {
              ans++;
            }
            break;
          case 'V':
            ans += 5;
            break;
          case 'X':
            if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
              ans += 40;
              i++;
            } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
              ans += 90;
              i++;
            } else {
              ans += 10;
            }
            break;
          case 'L':
            ans += 50;
            break;
          case 'C':
            if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
              ans += 400;
              i++;
            } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
              ans += 900;
              i++;
            } else {
              ans += 100;
            }
            break;
          case 'D':
            ans += 500;
            break;
          default:
            ans += 1000;
        }
        i++;
      }
      return ans;
    }
  }