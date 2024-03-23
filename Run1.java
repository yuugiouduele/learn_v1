package exam;

public class Run1 {
	public static void main(String[] args) {
		Thread log=new Thread(()->{
			System.out.println("logの処理開始");
			try {
				Thread.sleep(5000);
				System.out.println("logの休止");
			}catch(InterruptedException e) {
				System.out.println("logの割り込み発生");
			}
			System.out.println("logの処理再開");
		});
		log.start();
		try {
			Thread.sleep(1000);
			System.out.println("logの休止");
			log.interrupt();
		}catch(InterruptedException e) {
			System.out.println("logの割り込み成功");
		}
	}
	
}
