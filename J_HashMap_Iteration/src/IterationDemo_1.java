import java.util.HashMap;
import java.util.Map;

public class IterationDemo_1 {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		 // enter name/url pair
        map.put("GFG", "geeksforgeeks.org");
        map.put("Practice", "practice.geeksforgeeks.org");
        map.put("Code", "code.geeksforgeeks.org");
        map.put("Quiz", "quiz.geeksforgeeks.org");
        
        // using for-each loop for iteration over Map.entrySet()
        
        for(Map.Entry<String, String> entry: map.entrySet()){
        	System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
        }
		
	}
}
