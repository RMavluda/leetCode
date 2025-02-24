package org.example;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
      int count = 0;
      boolean f = false;
      for(int i = s.length()-1; i >= 0; i--){
        if(s.charAt(i) != ' ' && !f){
          f = true;
        }
        if(f){
          if(s.charAt(i) == ' '){
            break;
          }
          count++;
        }
      }
      return count;
    }
}
