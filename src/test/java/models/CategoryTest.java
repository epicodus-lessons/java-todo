package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CategoryTest {

  @Test
  public void NewCategoryObjectGetsCorrectlyCreated_true() throws Exception {
    Category category = setupNewCategory();
    assertEquals(true, category instanceof Category);
  }

  @Test
  public void CategoryInstantiatesWithName_school() throws Exception {
    Category category = setupNewCategory();
    assertEquals("school", category.getName());
  }

  //helper methods
  public Category setupNewCategory(){
    return new Category("school");
  }
}