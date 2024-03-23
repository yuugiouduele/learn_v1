package exam;

public class Heiretu1 {
private int a=0;
private String st="huhu";
public synchronized void set() {
	while(a!=0) {
		try {
			wait();
		}catch(InterruptedException e) {
		}
		notify();
		a++;
		st="data";
		System.out.println(a+":"+st);
	}
}
public synchronized void print() {
	while(st==null) {
		try {
			wait();
		}catch(InterruptedException e) {
		}
		notify();
	}
	a--;
	st=null;
	System.out.println(a+":"+st);
}
public static void main(String[] args) {
	Heiretu1 hei=new Heiretu1();
	hei.set();
	hei.print();
}
}
