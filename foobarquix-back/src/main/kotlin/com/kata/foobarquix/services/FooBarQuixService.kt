package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

	val FOO = "Foo";
	val BAR = "Bar";
	val QIX = "Quix";

	fun divide(i: Int): StringBuilder {
		val n = i.toString();
		val sb = StringBuilder();
		if (i % 3 == 0) {
			sb.append(FOO);

		}
		if (i % 5 == 0) {

			sb.append(BAR);
		}
		if (n.contains("7")) {
			return sb.append(QIX);
		}
		return sb;
	}

	fun concat(s1: String, s2: String): String {
		return s1 + s2
	}

	fun convertNumber(inputNumber: Int): String {

		return this.contain(inputNumber, this.divide(inputNumber));

	}


	fun contain(i: Int, divide: StringBuilder): String {
		val init: String = i.toString();
		val sb = StringBuilder();
		for (c in init.toCharArray()) {
			when (c) {
				'3' -> sb.append(FOO);
				'5' -> sb.append(BAR);

			}

		}

		if (sb.length == 0 && divide.length == 0) {
			return init;
		} else {
			return divide.toString() + sb.toString();
		}

	}

}