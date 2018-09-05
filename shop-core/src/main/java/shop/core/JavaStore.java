package shop.core;

import shop.api.Store;

/**
 * @author Mincong Huang
 * @since 1.0
 */
public class JavaStore implements Store {

  @Override
  public String getName() {
    return "Java 11";
  }

  @Override
  public String getAddress() {
    return "World wide";
  }
}
