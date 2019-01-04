package dk.northtech.singleprojectskeleton;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

// Consider writing the tests using JGiven (http://jgiven.org/)
class DummyThingyTest {
  @Test
  void hello_returns_correct_string() {
    DummyThingy thingy = new DummyThingy();
    assertThat(thingy.hello("Jes")).isEqualTo("Hello Jes");
  }
}
