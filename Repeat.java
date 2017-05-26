class Repeater {

	public char func(String x) {
		

		for (int i = 0; i < x.length(); i++) {
			
			int count = 0;
			for (int j = 0; j < x.length(); j++) {
				
				//System.out.println(j);

				if (x.charAt(i) == x.charAt(j)) {
					count++;
					//System.out.println(x.charAt(j));
				}
			}

			if(count == 1) {
				return x.charAt(i);
			}
		}

		return '\n';
	}
}

class Repeat  {

	public static void main(String[] args) {

		Repeater ob = new Repeater();
		System.out.println(ob.func("bbbbbcac"));	
	}
}