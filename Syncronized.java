package exam;

public  class Syncronized {
private int a=0;
private String b;
public  synchronized void set() {
	while(a!=0) {
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
	}
	notify();
	a++;
	b="data";
	System.out.println("set()"+a+" "+b);
}

public synchronized void print() {
	while(b==null) {
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
	}
	notify();
	a--;
	b="null";
	System.out.println("print()"+a+" "+b);
}
}
