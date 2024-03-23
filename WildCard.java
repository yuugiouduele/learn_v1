package exam;

class GEND<T extends Number> {
	private T var;

	public GEND(T var) {
		this.var = var;
	}

	public T getGEND() {
		return this.var;
	}

	public void display() {
		System.out.println(var);
	}
}

public class WildCard {
	public static void main(String[] args) {
		GEND<Integer> gen = new GEND<>(15);
		gen.display();
		GEND<Double> gen1 = new GEND<>(15.78);
		gen1.display();
		int val=Integer.parseInt("178");
		if(val==1) {
			print(new GEND<>(100) );
		}else {
			print(new GEND<>(19.00));
		}
		//	GENextend<String> gen2=new GENextend<>("成功");
	}

	static void print(GEND<?> obj) {
		System.out.println(obj.getGEND());
	}
}
