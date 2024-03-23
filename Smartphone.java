package exam;

import exam.Design511.IBorwser;
import exam.Design511.IMailer;
import exam.Design511.IPhone;

public class Smartphone implements IMailer, IBorwser, IPhone {
		// メールを送信する
		public void sendMail() {
		System.out.println("メールを送信する");
		}
		// メールを受信する
		public void receiveMail() {
		System.out.println("メールを受信する");
		}
		// 閲覧する
		public void borwse(String str) {
		System.out.println(str + "で閲覧する");
		}
		// 電話をかける
		public void callPhone() {
		System.out.println("電話を掛ける");
		}
		// 電話を受ける
		public void receivePhone() {
		System.out.println("電話を受ける");
		}
		}
	
		


