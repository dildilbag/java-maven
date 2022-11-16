package se.kth.compilers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class HelloTest {

  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @AfterEach
  public void tearDown() {
    System.setOut(standardOut);
  }

  @Test
  public void mainTest_empty() {
    Hello.main(new String[0]);
    Assertions.assertEquals("Hello World!", outputStreamCaptor.toString());
  }

  @Test
  public void mainTest_arg() {
    Hello.main(new String[] {"Sandra"});
    Assertions.assertEquals("Hello Sandra!", outputStreamCaptor.toString());
  }
}
