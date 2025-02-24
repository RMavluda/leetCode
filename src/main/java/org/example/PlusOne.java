package org.example;

public class PlusOne {

  public int[] plusOne(int[] digits) {

    digits[digits.length - 1]++;
    int c = 0;
    for (int i = digits.length - 1; i >= 0; i--) {
      digits[i] += c;
      c = digits[i] / 10;
      digits[i] %= 10;
    }
    int[] result = new int[c > 0 ? (digits.length + 1) : digits.length];
    int d = 0;
    if (c > 0) {
      result[d++] = c;
    }
    for (int i = 0; i < digits.length; i++) {
      result[d++] = digits[i];
    }
    return result;
  }
}
