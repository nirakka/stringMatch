package main;

public class Match {
	
	public int match(String s1, String s2) {
		// TODO Auto-generated method stub
		char ch1;
		
		if (s1.length() == 0 && s2.length() == 0) // s1,s2‚ª‚Æ‚à‚É‚©‚ç‚Å‚ ‚ê‚Î0‚ğ•Ô‚·
			return 0;
		for (int i1 = 0; i1 < s1.length(); i1++) {
			ch1 = s1.charAt(i1);

			if (s2.length() > 0) {
				if (s2.charAt(0) == ch1) {
					if (matchChar(s1, s2, i1)) {
						return i1;
					} else {
						continue;
					}
				}
			} else if (s2.length() == 0) {
				return 0;
			}
		}

		return -1;
	}
/**
 * 
 * @param s1
 * @param s2
 * @param i1
 * @return s1‚Æs2‚Æ”ä‚×‚ÄC‚»‚êˆÈ~‚Ì•¶š‚ªˆê’v‚µ‚½‚çTrue,‚»‚¤‚¶‚á‚È‚¯‚ê‚ÎFalse‚ğ•Ô‚·
 */
	private boolean matchChar(String s1, String s2, int i1) {

		for (int i2 = 0; i2 < s2.length(); i2++) {

			if (s1.length() <= i1 + i2)
				return false;
			if (s1.charAt(i1 + i2) == s2.charAt(i2)) {
				continue;
			} else {
				return false;
			}

		}

		return true;
	}
}
