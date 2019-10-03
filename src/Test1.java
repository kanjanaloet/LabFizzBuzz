import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class Test1 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_input_is_1_output_1() {
		FizzBuzz  FB = new FizzBuzz();
		int input = FB.printStringinput(1);
		assertEquals(1, input);
		
	}

}
