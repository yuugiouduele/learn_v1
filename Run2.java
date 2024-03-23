package exam;

public class Run2 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("run");
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				System.out.println("run");
			}

		}).start();

		new Thread(new Runnable() {
			public synchronized void run() {
				int i = 10;
				while (i == 5) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				notify();

				System.out.println("異常プログラム発生");
			}

		}).start();

		//スケジュールエクスきゅーたー持ってきて設定しないとエラーになる
		//このままだと同時に割り込みしてしまうから

		/**		new Thread(new Runnable(){			
					public  void run() {
						List<Integer>li=new ArrayList<Integer>();
						synchronized (li) {
							boolean bool=li.isEmpty();
							if(bool=true)
							System.out.println("この中身は"+bool+"なので空です。");
						}
							try {
								wait();
							}catch(InterruptedException e) {
								e.printStackTrace();
							}
						
						notify();
						
						System.out.println("異常プログラム発生");
					}
					
				}).start();   **/
	}
}
