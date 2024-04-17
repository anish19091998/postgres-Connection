package com.rest.api.rest;

import com.rest.api.rest.entities.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

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
		Integer a= 1;
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

}
