class Help {
	public static void main(String[] args) 
		throws java.io.IOException	{

		char num;
		char ignore;
		do {	
			System.out.println("\n\n\n\nHelp on:\n\t1. if\n\t2. switch\n\t3. for loop\n\t4. while loop\n\t5. do while loop\n\t6. break\n\t7. continue\n\tq is quitting\nChoose one:");

			num = (char) System.in.read();

			switch(num) {
				case '1':
					System.out.println("The if:\n\nif(condition) statement;\nelse statement;");
					break;
				case '2':
					System.out.println("The switch:\n\nswitch(expression) {\n\tcase constant:\n\t\tstatement sequence\n\t\tbreak;\n\t// ...\n}");
					break;
				case '3':
					System.out.println("The for loop:\n\nfor(initialization; condition; iteration)\n{\n\tstatement sequence\n}");
					break;
				case '4':
					System.out.println("The while loop:\n\nwhile (condition) {\n\tstatement sequence\n}");
					break;
				case '5':
					System.out.println("The do whlie loop:\n\ndo {\n\tstatements;\n} while(condition);");
					break;
				case '6':
					System.out.println("The break:\n\nbreak;");
					break;
				case '7':
					System.out.println("The continue:\n\ncontinue;");
					break;
				case 'q':
					System.out.println("GoodBye!!!");
					break;
				default:
					System.out.println("Not 1 or 2");
			}

			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');

		if (num == 'q') {
			break;
		}
		
		} while (true);

	}
}