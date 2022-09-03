package com.crleon.prep;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FamilyLoginsTest {

  @Test
  public void test1() {
    int actual = FamilyLogins.countFamilyLogins(List.of("bag", "sfe", "cbh", "cbh", "red"));
    assertEquals(3, actual);
  }

  @Test
  public void test2() {
    int actual = FamilyLogins.countFamilyLogins(List.of());
    assertEquals(0, actual);
  }

  @Test
  public void test3() {
    int actual = FamilyLogins.countFamilyLogins(List.of("abc", "zfh", "hea"));
    assertEquals(0, actual);
  }

  @Test
  public void test4() {
    int actual = FamilyLogins.countFamilyLogins(List.of("abc", "bcd", "cde"));
    assertEquals(2, actual);
  }

  @Test
  public void test5() {
    int actual = FamilyLogins.countFamilyLogins(null);
    assertEquals(0, actual);
  }
}
