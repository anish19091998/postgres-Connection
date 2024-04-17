package com.rest.api.rest;

import com.rest.api.rest.entities.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
class RestApplicationTests {


	@Test
	@DisplayName("comapre asserteqal method")
	void example1() {
		int result = someMethod();
		Assertions.assertEquals(42, result, "The result should be 42");
	}
	private int someMethod() {
		return 42;
	}
	@Test
	void example2(){
		Integer a= 1;
		Assertions.assertTrue(1==1,"its true");

	}

	@Test
	void example3(){

		Assertions.assertFalse(1>2,"its true");

	}


	@Test
	void example4(){
		Student student=null;
		Assertions.assertNull(student,"student is null");

	}

	@Test
	void example5(){
		Student student=new Student();
		Assertions.assertNotNull(student,"student is  not null");

	}

	@Test
	public void testNameException() {
		Student student = new Student();

		Assertions.assertThrows(RuntimeException.class, () -> {
			student.checkName("anish");
		});
	}

	@Test
	public void testArrayEquality() {
		int[] expected = {1, 2, 3};
		int[] actual ={1, 2, 3};
		Assertions.assertArrayEquals(expected, actual);
	}

	@Test
	public void testObjectReference() {
		Student obj1 = new Student();
		Student obj2 = obj1;
		Assertions.assertSame(obj1, obj2);
	}

	@ParameterizedTest
	@CsvSource({"1, 1, 2", "2, 3, 5", "5, 5, 10"})
	public void testAddition(int num1, int num2, int expectedResult) {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(expectedResult, calculator.add(num1, num2));
	}

	// Example using @ValueSource
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	public void testIsPositive(int number) {
		Assertions.assertTrue(number > 0);
	}

	// Example using @MethodSource
	@ParameterizedTest
	@MethodSource("stringProvider")
	public void testStringLength(String input, int expectedLength) {
		Assertions.assertEquals(expectedLength, input.length());
	}

	// Method providing parameters for the test using @MethodSource
	private static Stream<Arguments> stringProvider() {
		return Stream.of(
				Arguments.of("hello", 5),
				Arguments.of("world", 5),
				Arguments.of("JUnit", 5)
		);
	}

}
