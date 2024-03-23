package exam;

public class Design511 {
	interface IMailer{
		void sendMail();
		void receiveMail();
	}
	interface IBorwser extends IMailer{
		void borwse(String str);
	}
	interface IPhone {
		void callPhone();
		void receivePhone();
	}
}
