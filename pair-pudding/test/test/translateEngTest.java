package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import translate.IntToEng;

public class translateEngTest {

	@Test
	public void Undertest() {
		IntToEng ite = new IntToEng();
		String[] expected = {"zero","nineteen","twenty","ninety-nine","hundred"};
		//String[] actual = ite.translateEng();
		assertThat(ite.Under100(0), is(expected[0]));
		assertThat(ite.Under100(19), is(expected[1]));
		assertThat(ite.Under100(20), is(expected[2]));
		assertThat(ite.Under100(99), is(expected[3]));
		assertThat(ite.Under100(100), is(expected[4]));
		
	}
	
	@Test
	public void  Overtest() {
		IntToEng ite = new IntToEng();
		String[] expected = {"one-hundred-one","two-hundred","nine-hundred-ninety-nine"};
		//String[] actual = ite.translateEng();
		assertThat(ite.Over100(101), is(expected[0]));
		assertThat(ite.Over100(200), is(expected[1]));
		assertThat(ite.Over100(999), is(expected[2]));
	}
	
	@Test
	public void Translatetest() {
		IntToEng ite = new IntToEng();
		String[] expected = {"zero","nineteen","twenty","ninety-nine","hundred","one-hundred-one","two-hundred","nine-hundred-ninety-nine"};
		//String[] actual = ite.translateEng();
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
