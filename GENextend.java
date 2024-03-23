package exam;

 class GEN<T extends Number> {
private T var;
public GEN(T var) {
	this.var=var;
}
public void display() {
	System.out.println(var);
}
}

 public class GENextend{
	public static void main(String[] args) {
	GEN<Integer> gen=new GEN<>(15);
	gen.display();
	GEN<Double> gen1=new GEN<>(15.78);
	gen1.display();
//	GENextend<String> gen2=new GENextend<>("成功");
	}
	}
