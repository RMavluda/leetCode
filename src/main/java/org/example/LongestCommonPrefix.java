package org.example;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
      String str = "";
      int len = 201;
      for (var i : strs) {
        if (i.length() < len) {
          len = i.length();
          str = i;
        }
      }
      String[] strPrefix = new String[str.length()];
      int c = 0;
      for (int i = str.length(); i > 0; i--) {
        strPrefix[c] = str.substring(0, i);
        c++;
      }
      for (int j = 0; j < c; j++) {
        int count = 0;
        for (var i : strs) {
          if (i.substring(0, strPrefix[j].length()).equals(strPrefix[j])) {
            count++;
          }
        }
        if (count == strs.length)
          return strPrefix[j];
      }

      return "";
    }
}
