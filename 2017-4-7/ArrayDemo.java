class ArrayDemo {
	public static void main(String[] args) {
		// int table [] [] = new int [3][4];

		// for (int i =0; i < 3; i++) {

		// 	for (int j=0; j < 4; j++) {
				
		// 		table[i][j] = 4*i + j +1;
		// 		System.out.print(table[i][j] + "\t");
		// 	}

		// 	System.out.println();
			
		// }

		//Riders Example
		int riders[][] = new int[7][];

		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];
		riders[5] = new int[2];
		riders[6] = new int[2];

		int i, j;

		for (i=0; i<5; i++) {

			for (j=0; j<10; j++) {
				
				riders[i][j] = i * 10 + j + 1;
				System.out.print(riders[i][j] + "\t");
			}
			System.out.println();
			
		}

		for (i=5; i<7; i++) {

			for (j=0; j<2; j++) {
				
				riders[i][j] = i * 10 + j + 1 ;
				System.out.print(riders[i][j] + "\t");
			}
			System.out.println();
			
		}
	}
}