public class OneEditAway {
	public static void main(String[] args){
		String s1 = "apple";
		String s2 = "aplee";
		System.out.println(oneAway(s1, s2));
	}
	
	static boolean oneAway(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		
		if (len1 == len2) return oneEditReplace(s1, s2);
		else if (len1 + 1 == len2) return oneEditInsert(s1, s2);
		else if (len1 - 1 == len2) return oneEditInsert(s2, s1);
		return false;
	}
	
	static boolean oneEditInsert(String s1, String s2){
		int index1 = 0;
		int index2 = 0;
		while(index2 < s2.length() && index1 < s1.length()){
			if (s1.charAt(index1) != s2.charAt(index2)){
				if (index1 != index2){
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	
	static boolean oneEditReplace(String s1, String s2){
		boolean foundDiff = false;
		for (int i = 0; i < s1. length(); i++){
			if (s1.charAt(i) != s2.charAt(i)){
				if (foundDiff){
					return false;
				}
				foundDiff = true;
			}
		}
		return true;
	}
}