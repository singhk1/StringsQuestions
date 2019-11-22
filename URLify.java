public class URLify {
	public static void main(String[] args){
		String s = "Mr John Smith ";
		System.out.print(testURLify(s));
	}
	
	static String testURLify(String s){
		
		char[] chars = s.trim().toCharArray();
		StringBuilder sb = new StringBuilder(s.length());
		for (int i = 0; i < chars.length; i++){
			if (chars[i] == ' '){
				sb.append("%20");
			}else sb.append(chars[i]);
			System.out.println(sb.toString());
		}
		return sb.toString();
	}
}