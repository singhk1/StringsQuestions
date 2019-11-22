import java.util.Arrays;
public class CheckPermutation {
	public static void main(String[] args){
		String s1 = "dfgha";
		String s2 = "fdhpg";
		//System.out.print(checkPermutation(s1, s2));
		System.out.print(permutation(s1, s2));
	}
	
	static boolean checkPermutation(String s1, String s2){
		if (s1.length() != s2.length()) return false;
		return sort(s1).equals(sort(s2));
	}
	
	static String sort(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	static boolean permutation(String s1, String s2){
		if (s1.length() != s2.length()) return false;		
		int[] chars = new int[128];
		char[] charArray = s1.toCharArray();
		for (char c : charArray) {
			chars[c]++;
			System.out.print(chars[c]);
		}
		for (int i = 0; i < s2.length(); i++){
			int c = (int) s2.charAt(i);
			chars[c]--;
			if (chars[c] < 0) return false;
		}
		return true;
	}
}