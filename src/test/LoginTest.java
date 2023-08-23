package test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import library.LibrarianDao;

class LoginTest {

	@Test
	void test() {
		LibrarianDao ld = new LibrarianDao();
		//login test case 1
		boolean val=ld.validate("Aayush","123");
		assertEquals(val,true);
	}
	
	@Test
	void test1() {
		LibrarianDao ld = new LibrarianDao();
		//login test case 2
		boolean val=ld.validate("Pratik","pratik");
		assertEquals(val,true);
	}

	@Test
	void test2() {
		LibrarianDao ld = new LibrarianDao();
		//login test case 3
		boolean val=ld.validate("Sandesh","sandesh");
		assertEquals(val,true);
	}
	
	@Test
	void test3() {
		LibrarianDao ld = new LibrarianDao();
		//login test case 3
		boolean val=ld.validate("Jayesh","jayesh");
		assertEquals(val,true);
	}
	
	@Test
	void test4() {
		LibrarianDao ld = new LibrarianDao();
		//login test case 3
		boolean val=ld.validate("AWS","sandesh");
		assertEquals(val,true);
	}
}
