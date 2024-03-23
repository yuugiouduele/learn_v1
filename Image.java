package exam;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Image {
	public static void main(String[] args) {
		String inputname="ファイル.bmp";
		String outputname="fairu.png";
		try {
			BufferedImage bimage= ImageIO.read(new File(inputname));
			
			ImageIO.write(bimage,"png",new File(outputname));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
