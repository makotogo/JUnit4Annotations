package com.makotojava.learn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsDemoTest {

  private static final Logger log = Logger.getLogger(AnnotationsDemoTest.class.getName());

  private AnnotationsDemo classUnderTest;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    log.info("@BeforeClass - Runs one time, before any tests in this class.");
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    log.info("@AfterClass - Runs one time, after all tests in this class.");
  }

  @Before
  public void setUp() throws Exception {
    log.info("@Before - Runs before each test in this class.");
    classUnderTest = new AnnotationsDemo();
  }

  @After
  public void tearDown() throws Exception {
    log.info("@After - Runs after each test in this class.");
    classUnderTest = null;
  }

  @Ignore("SKIPPING THIS TEST!")
  @Test
  public void testReturn1() {
    fail("Not yet implemented");
  }

  @Test
  public void testReturn2() {
    log.info("@Test - Running test case...");
    int actual = classUnderTest.return2();

    assertEquals(2, actual);
    log.info("@Test - Test case done.");
  }

}
