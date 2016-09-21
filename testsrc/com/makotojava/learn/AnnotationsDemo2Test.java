package com.makotojava.learn;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationsDemo2Test {

  private static final Logger log = Logger.getLogger(AnnotationsDemo2Test.class.getName());

  private AnnotationsDemo2 classUnderTest;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    log.info("@BeforeClass - Runs one time, before any tests.");
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    log.info("@AfterClass - Runs one time, after all tests in this class.");
  }

  @Before
  public void setUp() throws Exception {
    log.info("@Before - Runs before each test in this class.");
    classUnderTest = new AnnotationsDemo2();
  }

  @After
  public void tearDown() throws Exception {
    log.info("@After - Runs after each test in this class.");
    classUnderTest = null;
  }

  @Test
  public void testReturn1() {
    log.info("@Test - Running test case...");
    Integer expected = Integer.valueOf(1);

    Integer actual = classUnderTest.return1();

    assertEquals(expected, actual);
    log.info("@Test - Test case done.");
  }

  @Test
  public void testReturn2() {
    log.info("@Test - Running test case...");
    Integer expected = Integer.valueOf(2);

    Integer actual = classUnderTest.return2();

    assertEquals(expected, actual);
    log.info("@Test - Test case done.");
  }

}
