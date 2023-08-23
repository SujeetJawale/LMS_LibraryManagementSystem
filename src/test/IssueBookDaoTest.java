package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import library.IssueBookDao;

class IssueBookDaoTest {

	@Test
	void test() {
		//Test case 1
		IssueBookDao ib = new IssueBookDao();
		int val=ib.save("A@1", 1, "Naman", "7845126532");
		assertEquals(val,1);
	}
	
	@Test
	void test1() {
		//test case 2
		IssueBookDao ib = new IssueBookDao();
		int val=ib.save("A@1",-1, "Amol", "4859261732");
		assertEquals(val,1);
	}

	@Test
	void test2() {
		//test case 2
		IssueBookDao ib = new IssueBookDao();
		int val=ib.save("A@1",2, "Nikhil", "7889562354");
		assertEquals(val,1);
	}
	
	@Test
	void test3() {
		//test case 2
		IssueBookDao ib = new IssueBookDao();
		int val=ib.save("A@1",-3, "Pavan", "8451963274");
		assertEquals(val,1);
	}
}
