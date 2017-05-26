class SqrRoot {
	public static void main(String[] args) 
		throws java.io.IOException{
		// double num, sroot, rerr;

		// for (num = 1.0; num < 100.0; num++) {
		// 	sroot = Math.sqrt(num);

		// 	System.out.println("Square root of " + num + " is " + sroot);

		// 	// rounding error
		// 	rerr = num - sroot * sroot;
		// 	System.out.println("Rounding error is " + rerr);
		// 	System.out.println();
		// }

		// int x;

		// for (x = 1024; x >= 1; x /= 2) {

		// 	System.out.println(x);
		// }

		// int x, y;
		// for (x= 0, y=10; x<y; x++, y--) {
		// 	System.out.println("x and y: " + (x + y));
		// }

		// int i;
		// for (i =0; (char) System.in.read() != 'S' ; i++) {
		// 	System.out.println("Pass #" + i);
		// }

		// int sum = 0;
		// int fact = 1;
		// int i;
		// for (i=1; i <= 5; i++) {
		// 	sum += i;
		// 	fact *= i;

		// 	System.out.println("i is " + i);
		// 	System.out.println("Sum is " + sum);
		// 	System.out.println("Factorial is " + fact);
		// }
		// System.out.println("i is " + i);
		// System.out.println("Sum is " + sum);
		// System.out.println("Factorial is " + fact);

		// char ch = 'a';
		// while (ch <= 'z') {
		// 	System.out.print(ch + " ");
		// 	ch++;
		// }
		// System.out.println();

		// char chb = 'z';
		// while (chb >= 'a') {
		// 	System.out.print(chb + " ");
		// 	chb--;
		// }
		// System.out.println();

		// char chc = 'A';
		// while (chc <= 'Z') {
		// 	System.out.print(chc + " ");
		// 	chc++;
		// }
		// System.out.println();

		// char chcb = 'Z';
		// while (chcb >= 'A') {
		// 	System.out.print(chcb + " ");
		// 	chcb--;
		// }
		// System.out.println();

		// char num = '0';
		// while (num <= '9') {
		// 	System.out.print(num + " ");
		// 	num++;
		// }
		// System.out.println();

		// char numb = '9';
		// while (numb >= '0') {
		// 	System.out.print(numb + " ");
		// 	numb--;
		// }
		// System.out.println();

		int i=0;
		for (int e = 0; e <= 10; e++) {

			if (i == 0) {
				i += 1;
			}
			else {
				i *= 3;
			}

			System.out.println("3 to the " + e + " power is " + i);
		}




	}
}