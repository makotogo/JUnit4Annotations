package com.makotojava.learn;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AnnotationsDemoTest.class, AnnotationsDemo2Test.class })
public class AnnotationsDemoTestSuite {

  private static final Logger log = Logger.getLogger(AnnotationsDemoTestSuite.class.getName());

  @BeforeClass
  public static void setupBeforeSuiteRuns() {
    log.info("@BeforeClass - Runs one time, before the test suite.");
  }

  @AfterClass
  public static void tearDownAfterSuiteRuns() {
    log.info("@AfterClass - Runs one time, after all tests in the test suite.");
  }
}
