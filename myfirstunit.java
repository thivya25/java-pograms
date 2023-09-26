package com.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class myfirstunit {

	@Test
	public void test() {
		addition obj=new addition();
		assertEquals(30, obj.add(10, 20));
		
		
	}

}
