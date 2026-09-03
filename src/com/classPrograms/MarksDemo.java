package com.classPrograms;

public class MarksDemo {

	public static void main(String[]args) {
		//create two dimensional array
		int marks[][]=new int[2][2];
		//s1 - 70 [0][0] 80[0][1]                        //70[0,0] 60[0,1] 80[0,2] 85[0,3]
		                                                 //98[1,0] 88[1,1] 94[1,2] 56[1,3]
		//s2 - 90 [1][0] 70[1][1]						//66[2,0] 77[2,1] 55[2,2] 77[2,3]
		//student 1 marks								//86[3,0] 90[3,1] 79[3,2] 63[3,3]
		marks[0][0]=70;
		marks[0][1]=80;
		//student 2 marks
		marks[1][0]=90;
		marks[1][1]=96;
		//displaying the marks of each student
		//outer for loop -> students (rows)
		//marks.length returns the number of rows in a array
		for(int i=0;i<marks.length;i++) {
			//inner for loop to read the marks of each student
			for(int j=0;j<marks[i].length;j++) {
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
	}

}
