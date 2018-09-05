package shop.core;

import shop.api.Store;

/**
 * @author Mincong Huang
 * @since 1.0
 */
public class Main {

  public static void main(String[] args) {
    Store s = new JavaStore();
    System.out.println("Welcome to " + s.getName());
  }
}
