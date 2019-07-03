package fruittest2;
/**
 * 
 * @author prattak
 *This is a program that simulates JUnit test scripts. The program
 *receives a string object as a fruit name in a specific case and returns
 *validation whether it was a correct fruit or not.
 *
 */
public class FruitTest {
	/**
	 * @param string apple object name in either upper case, lower case, or camel case
	 * @return boolean true/false to validate whether the value passed was an apple or not
	 */
	public boolean apple(String string) {
		boolean flag = false; 
		if (string == "apple" || string == "APPLE" || string == "Apple") {
			flag = true;
			System.out.println(flag + " I am an apple!!");
		}
		else {
			System.out.println(flag + " I am NOT an apple... :-(");
		}
		return flag;
	}
	/**
	 * @param string orange object name in either upper case, lower case, or camel case
	 * @return boolean true/false to validate whether the value passed was an orange or not
	 */
	public boolean orange(String string) {
		boolean flag = false;
		if (string == "orange" || string == "ORANGE" || string == "Orange") {
			flag = true;
			System.out.println(flag + " I am an orange!!");
		}
		else {
			System.out.println(flag + " I am NOT an orange... :-(");
		}
		
		return flag;
	}
	/**
	 * @param string banana object name in either upper case, lower case, or camel case
	 * @return boolean true/false to validate whether the value passed was an banana or not
	 */
	public boolean banana(String string) {
		boolean flag = false;
		if (string == "banana" || string == "BANANA" || string == "Banana") {
			flag = true;
			System.out.println(flag + " I am a banana!!");
		}
		else {
			System.out.println(flag + " I am NOT a banana... :-(");
		}

		return flag;
	}
}

