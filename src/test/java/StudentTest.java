import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class StudentTest {


    @Test
    public void testCreateStudent() {
      Student bob = new Student (111L, "bob");
      Student joe = null;
      assertNull(joe);
      assertNotNull(bob);
  }




}
