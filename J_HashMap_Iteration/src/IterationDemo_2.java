import java.util.HashMap;
import java.util.Map;

public class IterationDemo_2 {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		 // enter name/url pair
		map.put("GFG", "geeksforgeeks.org");
		map.put("Practice", "practice.geeksforgeeks.org");
		map.put("Code", "code.geeksforgeeks.org");
		map.put("Quiz", "quiz.geeksforgeeks.org");
		
		// using keySet() for iteration over keys
		for(String name: map.keySet()){
			System.out.println("Key "+name);
		}
		// using values() for iteration over values
       for(String value:map.values()){
    	   System.out.println("Value "+value);
       }
	}
}
