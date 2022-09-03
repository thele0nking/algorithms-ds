package com.crleon.prep;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImbalancedGroupsTest {

  @Test
  public void test1() {
    long actual = ImbalancedGroups.findTotalImbalance(new ArrayList<>(Arrays.asList(3, 1, 2)));
    assertEquals(1, actual);
  }

  @Test
  public void test2() {
    long actual = ImbalancedGroups.findTotalImbalance(new ArrayList<>(Arrays.asList(5, 10, 8, 4, 3, 1, 2)));

    assertEquals(1, actual);
  }
}
