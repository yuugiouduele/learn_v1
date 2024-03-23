package exam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

import orbeq.text.Charaset;

public class Design213 {
	public static void main(String[] arg) throws Exception {
		
	    overWrite("../files/writefile.txt ","奇跡", Charaset.Shift_JIS);
		System.out.println("成功");
}
	public static void overWrite(String filename, String data, Charaset charset)
			throws IOException {
			FileLock lock = null;
			OutputStreamWriter osw = null;
			FileChannel channel = null;
			try {
			File lockfile = new File(filename + ".lock");
			lockfile.deleteOnExit();
			FileOutputStream lockfos = new FileOutputStream(lockfile);
			channel = lockfos.getChannel();
			int retry = 0;
			do {
			lock = channel.tryLock();
			if (lock == null)
			Thread.sleep(2000);
			} while (lock == null && ++retry < 10);
			if (lock == null) {
			throw new IOException("ファイルがロックされています");
			}
			FileOutputStream fos = new FileOutputStream(filename);
			osw = new OutputStreamWriter(fos, charset.toString());
			osw.write(data);
			} catch (IOException ex) {
			throw ex;
			} catch (InterruptedException ex) {
			throw new RuntimeException(ex);
			} finally {
			if (osw != null) {
			osw.close();
			}
			if (lock != null) {
			lock.release();
			}
			if (channel != null) {
			channel.close();
			}
			}
			}
}
