import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterationDemo_3 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		 // enter name/url pair
		map.put("GFG", "geeksforgeeks.org");
		map.put("Practice", "practice.geeksforgeeks.org");
		map.put("Code", "code.geeksforgeeks.org");
		map.put("Quiz", "quiz.geeksforgeeks.org");
		
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key ="+entry.getKey()+", Value= "+entry.getValue());
		}
	}
}
