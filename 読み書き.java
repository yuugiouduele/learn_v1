package exam;
import orbeq.text.Charaset;
import orbeq.text.TextFileLightIO;
public class 読み書き {
	public static void main(String[] args) throws Exception {
		String txtdata = TextFileLightIO.read("../files/anime.txt", Charaset.UTF8);
		txtdata += "ルフィ";
		TextFileLightIO.overWrite("../files/anime2.txt", txtdata, Charaset.UTF8);
		}
}
