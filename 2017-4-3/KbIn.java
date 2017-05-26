class KbIn {
	public static void main(String[] args) 
		throws java.io.IOException {

			char ch;

			System.out.print("Press a key followed by ENTER: ");

			ch = (char) System.in.read(); //  get achar
			System.out.println("Your key in: " + ch);
	}

}