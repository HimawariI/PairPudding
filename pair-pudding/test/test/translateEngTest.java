package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import translate.IntToEng;

public class translateEngTest {

	@Test
	public void Undertest() {
		IntToEng ite = new IntToEng();
		String[] expected = { "zero", "nineteen", "twenty", "ninety-nine" };
		assertThat(ite.Under100(0), is(expected[0]));
		assertThat(ite.Under100(19), is(expected[1]));
		assertThat(ite.Under100(20), is(expected[2]));
		assertThat(ite.Under100(99), is(expected[3]));

	}

	@Test
	public void hundredsTest() {
		IntToEng ite = new IntToEng();
		String[] expected = { "one-hundred", "one-hundred-one", "two-hundred", "nine-hundred-ninety-nine" };
		assertThat(ite.hundreds(100), is(expected[0]));
		assertThat(ite.hundreds(101), is(expected[1]));
		assertThat(ite.hundreds(200), is(expected[2]));
		assertThat(ite.hundreds(999), is(expected[3]));
	}

	@Test
	public void thousandsTest() {
		IntToEng ite = new IntToEng();
		String[] expected = { "one-thousand", "one-thousand-one", "three-thousand-one-hundred",
				"nine-thousand-nine-hundred-ninety-nine", "ten-thousand", "nineteen-thousand-nine-hundred-ninety-nine",
				"one-hundred-thousand" };
		assertThat(ite.thousands(1000), is(expected[0]));
		assertThat(ite.thousands(1001), is(expected[1]));
		assertThat(ite.thousands(3100), is(expected[2]));
		assertThat(ite.thousands(9999), is(expected[3]));
		assertThat(ite.thousands(10000), is(expected[4]));
		assertThat(ite.thousands(19999), is(expected[5]));
		assertThat(ite.thousands(100000), is(expected[6]));
	}

	@Test
	public void Translatetest() {
		IntToEng ite = new IntToEng();
		String[] expected = { "zero", "nineteen", "twenty", "ninety-nine", "one-hundred", "one-hundred-one",
				"two-hundred", "nine-hundred-ninety-nine" };
		assertThat(ite.translateEng(0), is(expected[0]));
		assertThat(ite.translateEng(19), is(expected[1]));
		assertThat(ite.translateEng(20), is(expected[2]));
		assertThat(ite.translateEng(99), is(expected[3]));
		assertThat(ite.translateEng(100), is(expected[4]));
		assertThat(ite.translateEng(101), is(expected[5]));
		assertThat(ite.translateEng(200), is(expected[6]));
		assertThat(ite.translateEng(999), is(expected[7]));

	}

}
