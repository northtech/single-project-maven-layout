package dk.northtech.singleprojectmavenlayout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DummyThingy {
  private static final Logger LOGGER = LoggerFactory.getLogger(DummyThingy.class);

  public String hello(String name) {
    LOGGER.info("Hello invoked with name {}", name);
    return "Hello " + name;
  }
}
