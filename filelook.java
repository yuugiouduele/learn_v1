package exam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class filelook {
	
	public static void main(String[] args) throws Exception {
		FileLock lock = null;
		FileChannel ch = null;
		FileWriter fw = null;
		FileOutputStream fs=null;
		try {
			File lockfile=new File("file.lock");
			lockfile.deleteOnExit();
			fs=new FileOutputStream(lockfile);
			ch=fs.getChannel();
			
			int retry=0;
			do {
				lock=ch.tryLock();
				if(lock==null)
					Thread.sleep(2000);
					else
						System.out.println(String.format("ロック%s回目", retry+1));
			}while(lock==null && ++retry<10);
			if(lock==null)
				throw new RuntimeException("ファイルロックに失敗しました");
		fw = new FileWriter("../files/myfile.txt",true);
		String ls = System.getProperty("line.separator");
		for(int i=0;i<10;i++) {
			fw.write(String.format("%s回目の書き込み",i+1));
			fw.write(ls);
			fw.flush();
			Thread.sleep(1000);
			}
		} catch (Exception ex) {
		throw ex;
		} finally {
		if (fw != null)fw.close();
		if (lock!=null)lock.release();
		if(ch != null) ch.close();
		if(fs != null) fs.close();
		}
		}
}
