
public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Review myReview = new Review();
		myReview.exampleMethod("Print this string");
	}

	public static void exampleStatic () {
		System.out.println("Example Static");
	}
	
	public String exampleMethod (String message) {
//		System.out.println(message);
		return message;
	}
}
