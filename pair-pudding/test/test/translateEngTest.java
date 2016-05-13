package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import translate.IntToEng;

public class translateEngTest {

	@Test
	public void test() {
		IntToEng ite = new IntToEng();
		String[] expected = {"zero","one", "ten","nineteen","thirty", "eighty-five", "ninety-nine","hundred"};
		//String[] actual = ite.translateEng();
		assertThat(ite.translateEng(0), is(expected[0]));
		assertThat(ite.translateEng(1), is(expected[1]));
		assertThat(ite.translateEng(10), is(expected[2]));
		assertThat(ite.translateEng(19), is(expected[3]));
		assertThat(ite.translateEng(30), is(expected[4]));
		assertThat(ite.translateEng(85), is(expected[5]));
		assertThat(ite.translateEng(99), is(expected[6]));
		assertThat(ite.translateEng(100), is(expected[7]));
	}

}
