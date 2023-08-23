package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import library.BookDao;

class BookDaoTest {

	@Test
	void test() {
		BookDao bd = new BookDao();
		int val = bd.save("C@1", "The monk who sold his ferrari", "Robin Sharma", "ABC", 3);
		assertEquals(1,val);
	}
	
	@Test
	void test1() {
		BookDao bd = new BookDao();
		int val = bd.save("C@2", "STQA", "Prof. Shrikant Kokate", "DEF", 2);
		assertEquals(1,val);
	}
	
	@Test
	void test2() {
		BookDao bd = new BookDao();
		int val = bd.save("C@3", "Think like a monk", "Jay Shetty", "QWSA", -1);
		assertEquals(1,val);
	}
	
	@Test
	void test3() {
		BookDao bd = new BookDao();
		int val = bd.save("C@4", "Flirting with Stocks", "Anil Lamba", "qwerty", -2);
		assertEquals(1,val);
	}

}
