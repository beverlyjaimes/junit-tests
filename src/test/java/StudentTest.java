import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class StudentTest {


    @Test
    public void testCreateStudent() {
      Student bob = new Student (1L, "bob");
      Student joe = null;
      assertNull(joe);
      assertNotNull(bob);
  }

  @Test
    public void testStudentFields(){
        Student bob = new Student (1L, "bob");
        assertSame(1L, bob.getId());
        assertSame("bob", bob.getName());
        assertSame(0,bob.getGrades().size());
  }

  @Test
    public void testAddGrade(){
        Student bob = new Student(1L, "bob");
        bob.addGrade(100);
        assertSame(100, bob.getGrades().get(0));
        bob.addGrade(80);
        assertSame(80, bob.getGrades().get(1));


  }
    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "bob");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
    }




}
