package onejavaVideo;

public class Arrays2 {

	public static void main(String[] args) {
		
		int[][] ikiBoyut = new int[3][10]; //2 boyutlu array tanýmý
		
		ikiBoyut[2][7] = 38;
		ikiBoyut[0][0] = 54;
		ikiBoyut[1][3] = 6;
		
		for (int i = 0; i < ikiBoyut.length; i++) {
			for (int j = 0; j < ikiBoyut[0].length; j++) {
				System.out.print(ikiBoyut[i][j]);
				
			}
			System.out.println();
			
		}

	}

}
