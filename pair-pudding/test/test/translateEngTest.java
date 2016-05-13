package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import translate.IntToEng;

public class translateEngTest {

	@Test
	public void Undertest() {
		IntToEng ite = new IntToEng();
		String[] expected = {"zero","hundred"};
		//String[] actual = ite.translateEng();
		assertThat(ite.Under100(0), is(expected[0]));
		assertThat(ite.Under100(100), is(expected[1]));
		
	}
	
	@Test
	public void Translatetest() {
		IntToEng ite = new IntToEng();
		String[] expected = {"zero","hundred","one-hundred-one"};
		//String[] actual = ite.translateEng();
		assertThat(ite.translateEng(0), is(expected[0]));
		assertThat(ite.translateEng(100), is(expected[1]));
		assertThat(ite.translateEng(101),is(expected[2]));
		
	}

}
