package lab.juntaek.inbox.domain;

import static org.junit.jupiter.api.Assertions.*;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

class MainTest {
	@Test
	void equalsAndHashcodeTest() {
		final TestTestTest testTestTest1 = new TestTestTest("a", "b");
		final TestTestTest testTestTest2 = new TestTestTest("a", "c");
		System.out.println(testTestTest1.equals(testTestTest2));
	}

	@RequiredArgsConstructor
	@EqualsAndHashCode
	static abstract class TestTest {
		private final String id;
	}

	@EqualsAndHashCode(callSuper = true)
	static class TestTestTest extends TestTest {
		private String a;

		public TestTestTest(String id, String a) {
			super(id);
			this.a = a;
		}
	}
}