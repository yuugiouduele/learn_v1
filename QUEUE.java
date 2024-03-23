package exam;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class QUEUE {
public void qons() {
	BlockingQueue<Double>bq=new LinkedBlockingQueue<>();
	
	new Thread(()->{
		while(true) {
			try {
				bq.offer(Math.random(),2,TimeUnit.SECONDS);
				System.out.println(bq.size());
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}).start();
	
	new Thread(()->{
		while(true) {
			try {
				double nbq=bq.poll(2,TimeUnit.SECONDS);
				System.out.println(nbq);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}).start();
}
}
