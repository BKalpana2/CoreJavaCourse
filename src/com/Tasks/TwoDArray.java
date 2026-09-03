package com.Tasks;

public class TwoDArray {

	public static void main(String[] args) {
        //70[0,0] 60[0,1] 80[0,2] 85[0,3]
		//98[1,0] 88[1,1] 94[1,2] 56[1,3]
		//66[2,0] 77[2,1] 55[2,2] 77[2,3]
		//86[3,0] 90[3,1] 79[3,2] 63[3,3]
		
		int m[][]=new int[4][4];
		m[0][0]=70;
		m[0][1]=60;
		m[0][2]=80;
		m[0][3]=85;
		m[1][0]=98;
		m[1][1]=88;
		m[1][2]=94;
		m[1][3]=56;
		m[2][0]=66;
		m[2][1]=77;
		m[2][2]=55;
		m[2][3]=77;
		m[3][0]=86;
		m[3][1]=90;
		m[3][2]=79;
		m[3][3]=63;
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

}
