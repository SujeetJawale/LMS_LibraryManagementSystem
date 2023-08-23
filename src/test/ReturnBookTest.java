package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import library.ReturnBookDao;

class ReturnBookTest {

	@Test
	void test() {
		ReturnBookDao rb =new ReturnBookDao();
		int val = rb.delete("A@1", 2);
		assertEquals(1, val);
	}
	
	@Test
	void test1() {
		ReturnBookDao rb =new ReturnBookDao();
		int val = rb.delete("B@1", -1);
		assertEquals(1, val);
	}

	@Test
	void test2() {
		ReturnBookDao rb =new ReturnBookDao();
		int val = rb.delete("C@1", 1);
		assertEquals(1, val);
	}

}
