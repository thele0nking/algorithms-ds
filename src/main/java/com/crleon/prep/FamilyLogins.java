package com.crleon.prep;

import java.util.ArrayList;
import java.util.List;

public class FamilyLogins {
  public static int countFamilyLogins(List<String> logins) {
    if (logins == null || logins.size() == 0) return 0;
    List<String> transformedStrings = transformStrings(logins);
    int count = 0;

    for (String str : transformedStrings) {
      for (String login : logins) {
        if (str.equals(login)) count++;
      }
    }
    return count;
  }

  private static List<String> transformStrings(List<String> logins) {
    List<String> transformedStrings = new ArrayList<>();
    for (String login : logins) {
      StringBuilder sb = new StringBuilder();
      for (Character c : login.toCharArray()) {
        int transform = (c - 'a') + 1;
        if (transform > 26) transform = 0;
        sb.append((char) (transform + 'a'));
      }
      transformedStrings.add(sb.toString());
    }

    return transformedStrings;
  }
}
