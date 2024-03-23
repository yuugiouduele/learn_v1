package exam;

public class Genelix {
	public static void main(String[] args) {
		Geny<String>genelix=new Geny<>("お前の命");
		System.out.println(genelix.getgene1());
		genelix.setgene1("君の命");
		System.out.println(genelix.getgene1());
		
		Geny<Integer>genelix2=new Geny<>(100);
		System.out.println(genelix2.getgene1());
		genelix2.setgene1(1000);
		System.out.println(genelix2.getgene1());
	}
}

class Geny<T>{
	private T gene1;
	//private static T gene1;
	public Geny(T gene1) {
		this.gene1=gene1;
	}
	public T getgene1() {
		return gene1;
	}
	public void setgene1(T gene1) {
		this.gene1=gene1;
	}
}