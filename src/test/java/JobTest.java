import org.junit.*;
import static org.junit.Assert.*;

public class JobTest {
  private Job mJob;

  @Before
  public void initialize() {
   mJob = new Job();
 }

  @Test
  public void job_instantiateObject_true() {
    assertEquals(true, mJob instanceof Job);
  }

}
