import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class Test2 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_input_is_1_output_1() {
		FizzBuzz  FB = new FizzBuzz();
		int input = FB.printStringinput(2);
		assertEquals(2, input);
		
	}

}
