package exam;

import exam.Design511.IBorwser;
import exam.Design511.IMailer;
import exam.Design511.IPhone;

public class ExamTelMailWeb {
		public static void main(String[] args) {
		Smartphone cp = new Smartphone();
		funcPhone(cp);
		funcMailer(cp);
		funcBorwser(cp, "Chrome");
		}
		// 電話としての処理
		public static void funcPhone(IPhone phone) {
		phone.callPhone(); // 電話を掛ける
		phone.receivePhone(); // 電話を受ける
		}
		// メーラーとしての処理
		public static void funcMailer(IMailer mailer) {
		mailer.sendMail(); // メールを送信する
		mailer.receiveMail(); // メールを受信する
		}
		// ブラウザとしての処理
		public static void funcBorwser(IBorwser computer, String str) {
		computer.borwse(str); // 閲覧する
		}
		}

