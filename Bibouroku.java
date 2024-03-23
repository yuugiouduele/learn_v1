package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;

public class Bibouroku extends Exception {

	public static void main(String[] args) {
		TimerTask task1 = new TimerTask() {
			public void run() {
				new Thread(new Runnable() {
					public synchronized void run() {
						String[] heiretu = { "koko", "koi", "huhu" };
						int i = heiretu.length;
						try {
							wait();
							for (String str : heiretu)
								System.out.println(i + str);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		};

		new Thread(new Runnable() {
			public synchronized void run() {
				String[] heiretu = { "koko", "koi", "huhu" };
				HashMap<ArrayList<Long>, Map<String, Integer>> map = new HashMap<>();
				map.put(null, null);
				Optional<Integer> op = map.stream().sort().peek().filter().limit().map(s::Integer).collect();
				op.orElseThrow();
				Timer task2 = new Timer();
				task2.schedule(task1, 9000);
				
				NavigableMap<String,Integer>key1=new TreeMap<>();
				key1.put("北海道", 90);
				key1.put("青森", 90);
				key1.put("秋田", 90);
				key1.put("岩手", 90);
				ArrayList<>jujutu=new ArrayList<>();
				synchronized(jujutu.get(key1)) {
					
				}
				
				int i = heiretu.length;
				try {
					wait();
					for (String str : heiretu)
						System.out.println(i + str);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
				notify();
			}
		}).start();
		
		ExecutorService exit=new ExecutorService();
		try(
				
				
				){
			
		}catch(Exception | RuntimeException e) {
			
		}finally {
			
		}
	}
}
