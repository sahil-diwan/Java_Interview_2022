import java.util.HashMap;
import java.util.Map;

import org.omg.Messaging.SyncScopeHelper;

public class IterationDemo_4 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		 // enter name/url pair
		map.put("GFG", "geeksforgeeks.org");
		map.put("Practice", "practice.geeksforgeeks.org");
		map.put("Code", "code.geeksforgeeks.org");
		map.put("Quiz", "quiz.geeksforgeeks.org");
		
		map.forEach((k,v)-> System.out.println("Key = "+k+", Value= "+v));
	}
}
