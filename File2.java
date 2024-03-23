package exam;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File2 {
	public static void main(String[] args) {
		FileSystem fsys = FileSystems.getDefault();
		Iterable<Path> it = fsys.getRootDirectories();
		for (Path name : it) {
			System.out.println(name);
		}
		//ここから違うパス参照
		Path p = Paths.get("");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(p)) {
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//ここから違うパス参照
		try {
		Path path1=Paths.get("data.text");
		Object op1=Files.getAttribute(path1, "creationTime");
	    Object op2=Files.getAttribute(path1, "lastModifiedTime");
		Object op3=Files.getAttribute(path1, "size");
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		}catch(IOException e) {
			e.printStackTrace();
		}
		//ここから違うパス参照
		
	}
}
