package shop.core;

import org.junit.Test;
import shop.api.Store;

import static org.junit.Assert.assertNotNull;

/**
 * @author Mincong Huang
 * @since 1.0
 */
public class JavaStoreTest {

  @Test
  public void testStore() {
    Store store = new JavaStore();
    assertNotNull(store.getName());
    assertNotNull(store.getAddress());
  }
}
