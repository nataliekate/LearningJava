import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Review {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("hello");
			BufferedReader reader = new BufferedReader(file);
			String data;
			while ((data = reader.readLine()) != null) {
				System.out.println(data);
			}
			
			reader.close();
		} catch (IOException error) {
			// TODO Auto-generated catch block
			System.out.println(error);
		}
	}
}
