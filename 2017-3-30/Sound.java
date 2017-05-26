class Sound {
	public static void main(String[] args) {
		double seconds = 10;
		System.out.println("The lightening strike was " 
			+ distance(seconds)
			+ " feet away. Echo is: " + echo(distance(seconds))
			+ " feet away. Miles is: " + miles(echo(distance(seconds))));
	}

	public static double distance(double secs) {
		return (secs * 1100);
	}

	public static double echo(double dist) {
		return (dist / 2);
	}

	public static double miles(double echoLol) {
		return echoLol / 5280; 
	}
}