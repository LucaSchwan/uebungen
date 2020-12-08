public class BooleanStringHelper {
	public static boolean [] parse(String s, char c) {
		boolean b[];
	        b = new boolean[s.length()];
		//System.out.println(b);
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				b[i] = true;
			} else {
				b[i] = false;
			}
		}
		return b;
	}

	public static String stringify(boolean[] b, char c1, char c2) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < b.length; i++) {
			if(b[i]) {
				builder.append(c1);
			} else {
				builder.append(c2);
			}
		}
		return builder.toString();
	}
}

