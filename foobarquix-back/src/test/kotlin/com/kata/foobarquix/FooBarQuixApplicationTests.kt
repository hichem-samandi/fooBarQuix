package com.kata.foobarquix

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Assertions.assertEquals
import com.kata.foobarquix.services.FooBarQuixService


private val fooBarQuixService: FooBarQuixService = FooBarQuixService()


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FooBarQuixApplicationTests {
	
	

	@Test
	fun contextLoads() {
		val expected1: String = "FooFoo";
		val num1: Int = 3;
		val actual1 = fooBarQuixService.convertNumber(num1);
		assertEquals(expected1,actual1);

		val expected2: String = "BarBar";
		val num2: Int = 5;
		val actual2 = fooBarQuixService.convertNumber(num2);
		assertEquals(expected2,actual2);
		
		
		val expected3: String = "Quix";
		val num3: Int = 7;
		val actual3 = fooBarQuixService.convertNumber(num3);
		assertEquals(expected3,actual3);


	}

}
