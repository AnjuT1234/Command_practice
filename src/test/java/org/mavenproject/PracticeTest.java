package org.mavenproject;

import org.testng.annotations.Test;

public class PracticeTest {
	
	@Test
	public void test1()
	{
		System.out.println("testing 1");
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		String username=System.getProperty("USERNAME");
		String password=System.getProperty("PASSWORD");
		
		System.out.println("browser--->"+browser);
		System.out.println("username--->"+username);
		System.out.println("password--->"+password);
		System.out.println("url--->"+url);
	}
	
	@Test
	public void test2()
	{
		System.out.println("testing 2");
		System.out.println("status updated");
		System.out.println("status deleted");
		
		
	}
	
	@Test
	public void test3()
	{
		System.out.println("testing 3");
		System.out.println("new branch created");
	}
	@Test
	public void test4()
	{
		System.out.println("testing 4");
	}

	public void test10()
	{
		System.out.println("NEW");
	}
	
}
