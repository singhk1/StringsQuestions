public class PalindromePermutation {
	public static void main(String[] args){
		String st = "Tact Coa";
		System.out.println(checkPermutation(st));
		System.out.println(isPalindromePermutation(st));
	}
	
	static boolean checkPermutation(String s){
		int[] table = frequencyTable(s);
		return checkMaxOneOdd(table);
	}
	
	static int[] frequencyTable(String st) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c: st.toCharArray()){
			int x = getCharacterNumber(c);
			if (x != -1) table[x]++;
		}
		return table;
	}
	
	static boolean checkMaxOneOdd(int[] table){
		boolean foundOdd = false;
		for (int count : table){
			if (count % 2 == 1){
				if (foundOdd) return false;
				foundOdd = true;
			}			
		}
		return true;
				
	}
	
	static int getCharacterNumber(Character c){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) return val - a;
		return -1;
	}
	
	static boolean isPalindromePermutation(String s){
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c : s.toCharArray()){
			int x = getCharacterNumber(c);
			if (x != -1){
				table[x]++;
				if (table[x] % 2 == 1) countOdd++;
				else countOdd--;
			}
		}
		return countOdd <= 1;
	}
}