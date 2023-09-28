public class Bai02 {
	public static void main(String[] args) {
		String str = "Dang Thanh Nhan";
		
		System.out.println("Ten sau khi cat ten lot la: " + shortName(str));
		System.out.println("Ten sau khi gan hashtag la: " + hashtagName(str));
		System.out.println("Ten sau khi viet hoa tat ca nguyen am la: " + upperCaseAllVowel(str));
		System.out.println("Ten sau khi viet hoa tat ca chu n la: " + upperCaseAllN(str));	
	}
	
	public static String shortName(String str) {
		String[] words = str.split("\\s++");
		return words[0] + " " + words[words.length - 1];
	}
	
	public static String hashtagName(String str) {
		String[] words = str.split("\\s++");
		return "#" + words[0] + words[words.length - 1];
	}
	
	public static String upperCaseAllVowel(String str) {
		char[] s1 = str.toCharArray();
        	for (int i = 0; i < str.length(); i++) {
           	char c = s1[i];
            	if (c == 'u' || c == 'e' || c == 'o' || c == 'a' || c == 'i') {
                		s1[i] = Character.toUpperCase(s1[i]);
            	}
            	else if (c == 'U' || c == 'E' || c == 'O' || c == 'A' || c == 'I') {
                		s1[i] = Character.toUpperCase(s1[i]);
           	}
        	}
        	str = new String(s1);
        	return str;
	}
	
	public static String upperCaseAllN(String str) {
		char[] s1 = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char c = s1[i];
			if(c == 'n')	s1[i] = Character.toUpperCase(s1[i]);
		}
		return String.valueOf(s1);
	}
}