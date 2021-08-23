import java.util.HashMap;
import java.util.Map;

public class IterationDemo_5 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		 // enter name/url pair
		map.put("GFG", "geeksforgeeks.org");
		map.put("Practice", "practice.geeksforgeeks.org");
		map.put("Code", "code.geeksforgeeks.org");
		map.put("Quiz", "quiz.geeksforgeeks.org");
		
		for(String name:map.keySet()){
			
			String value = map.get(name);
			System.out.println();
		}
	}
}
