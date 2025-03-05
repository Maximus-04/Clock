import java.util.Map;

public class SetUTF {
	// Makes the HashMap of UTF's
	public Map<String, Integer> UTF;
	
	public SetUTF() {
		// Puts the UTF zones in the state it measures.
		UTF.put("Alaska", 8);
		UTF.put("California", 7);
		UTF.put("Arizona", 6);
		UTF.put("Texas", 5);
		UTF.put("New York", 4);
	}
	
	public Map<String, Integer> getUTF() {
		return UTF;
	}
	
	public static void main(String[] args) {
		SetUTF setUtf = new SetUTF();
		System.out.println(setUtf.getUTF());
	}
}
