package org.example;

public class MinimumNumberOfPushesToTypeWord {

  public int minimumPushes(String word) {
    int n = word.length();
    int i = 1;
    int answer = 0;
    while (n > 0) {
      int k = (n - 8 >= 0 ? 8 : n);
      answer += (k * i);
      n -= k;
      i++;
    }
    return answer;

  }
}
