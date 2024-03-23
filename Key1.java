package exam;

import java.awt.event.KeyEvent;

public final class Key1 {
	
	public static KeyboardInput key = new KeyboardInput();

	public static void poll() {
		key.poll();
	}

	public static boolean keydown(int keycode) {
		return key.keydownonce(keycode);
	}

	public static boolean keydownonce(int keycode) {
		return key.keydownonce(keycode);
	}

	public static void keypressed(KeyEvent e) {
		key.keyPressed(e);
	}

	public static void keyreleased(KeyEvent e) {
		key.keyReleased(e);
	}

}
