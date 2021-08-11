package eg1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Setup");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Teardown");
	}

	@Test
	void testAdd() {
		assertEquals(8, Add.add(5, 3), "Incorrect Addition");
	}
	
	@Test
	void testAddPositiveNumbers_whenNegative() {
		try {
			Add.addPositiveNumbers(-5, -3);
			fail("No Exception thrown");
		}
		catch(IllegalArgumentException e){
			assertEquals("Negative numbers not allowed", e.getMessage());
		}
	}
	
	@Test
	void testAddPositiveNumbers_whenPositive() {
		assertEquals(8, Add.addPositiveNumbers(5, 3), "Incorrect Addition");
	}

}
