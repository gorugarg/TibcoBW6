
package com.tibco.certification;


public class HellowWorld_1382018  implements java.io.Serializable{
	
	public static String sayHello(String input)
	{
		return "Hello"+input;
	}
	public  String sayHelloToJavaGlobalInstance(String input)
	{
		return "Hello"+input;
	}
	public HellowWorld_1382018(int a)
	{

		

		/*System.out.println("Only constructor functions are visible in java global instance shared resource methods tab");*/
	}
	public void CleanUpMethod()
	{
		/*System.out.println("Its used for cleaning the object so that its release from memory . THis method should be non parametrized . "
				+ "Any value returend by this method are ignored");*/
	}

}
