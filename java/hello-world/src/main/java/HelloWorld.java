public class HelloWorld {
	public static String hello(String name) {
		String result = "Hello, ";

		if (name == null || name.equals("")) {
			result += "World!";
		} else {
			result += name + "!";
		}

		return result;
	}
}
