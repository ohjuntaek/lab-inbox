package lab.juntaek.inbox.domain;

import static org.junit.jupiter.api.Assertions.*;

class EntityTest {
	@org.junit.jupiter.api.Test
	void test() {
		final TestTest testTest = new TestTest();
		System.out.println(testTest.a());
		System.out.println(testTest.aa());
	}
}

interface Test {
	default String a() {
		return getClass().getName();
	}
}

abstract class AbsTest {
	String aa() {
		return getClass().getTypeName();
	}
}

class TestTest extends AbsTest implements Test {

}