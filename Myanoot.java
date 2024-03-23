package exam;



public @interface Myanoot {
	String value();
	
	public enum Rank{
		First,Second,Third
	}
	
	Rank rank();
	
	int amount();
	
	double sort();
	
	float mini();
	
	long max();
	
	public enum Item {
		Jugu,Jusi,Junten,Hanten,Kusouzu
	}
	
	Item item();
	
	String jujutu() default "" ;
	
	
}
