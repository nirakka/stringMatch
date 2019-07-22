package main;

public class First {
	Match m = new Match();
	
	public static void main(String[] args) {
		First x = new First();	
		x.run();
		
	}
	
	/*
	 * s2 \ s1  "" "a" "ab" "abc" 
	 * ""       0  0   0    0 
	 * "a"     -1  0   0    0 
	 * "ab"    -1 -1   0    0
	 * 
	 * s2 \ s1     "xa"  "xaab"  "xayab"
	 *     ""         0     0       0
	 *     "a"        1     1       1
	 *     "ab"      -1     2       3
	 */
	
	String [] s1 = {"", "a", "ab", "abc","xa", "xaab", "xayab"};
	String [] s2 = {"", "a", "ab"};
	int [][] answer = {{0,-1,-1}, {0,0,-1}, {0,0,0},{0,0,0},{0, 1,-1},{0, 1,2},{0, 1,3}};
	
	public void run() {
		for (int l1 = 0; l1 < s1.length; l1++) {
			for (int l2 = 0; l2 < s2.length; l2++) {
				makeComb(l1, l2);
			}
		}
		
	}
	
	private void makeComb(int l1, int l2) {
		int num;

		num = m.match(s1[l1], s2[l2]);
		
		if ( num == answer[l1][l2]) {
			System.out.print("Correct ");
		} else {
			System.out.print("Incorrect ");
		}
		System.out.println("s1:" + s1[l1] + " s2:" + s2[l2] + " num:" + num);
	}
	
}
