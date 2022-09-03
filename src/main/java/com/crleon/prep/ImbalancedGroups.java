package com.crleon.prep;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImbalancedGroups {
  public static long findTotalImbalance(List<Integer> rank) {
    if (rank == null || rank.size() < 2) return 0;
    long imbalances = 0;
    for (int i = 0; i < rank.size(); i++) {
      for (int j = rank.size() - 1; j > i; j--) {
        List<Integer> sortedRanks = rank.subList(i, j + 1);
        Collections.sort(sortedRanks);
        System.out.println(Arrays.toString(sortedRanks.toArray()));
        for (int k = 0; k < sortedRanks.size(); k++) {
          for (int l = k + 1; l < sortedRanks.size(); l++) {
            if (sortedRanks.get(l) - sortedRanks.get(k) > 1) imbalances++;
          }
        }
      }
    }

    return imbalances;
  }
}
