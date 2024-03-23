package exam;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Heiretu2 {
	public static void main(String[] args)throws Exception {
ExecutorService exsv=null;
try{
		exsv = Executors.newSingleThreadExecutor();
		Future<?> result1 = exsv.submit(() -> System.out.println("gugu"));
		System.out.println(result1.get());
		Future<Boolean> result2 = exsv.submit(() -> System.out.println("GAGA"), true);
		System.out.println(result2.get());
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
     catch(ExecutionException e) 
	{
		e.printStackTrace();
	}finally
	{
		if (exsv != null)
			exsv.shutdown();
	}
	}
}
