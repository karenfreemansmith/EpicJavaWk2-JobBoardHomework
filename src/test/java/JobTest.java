import org.junit.*;
import static org.junit.Assert.*;

public class JobTest {
  private Job job = new Job();

  @Test
  public void job_instantiateObject_true() {
    assertEquals(true, job instanceof Job);
  }

}
