package exam;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {

	private static final int KEY_COUNT = 256;

	private enum KeyState {
		RELEASED, PRESSED, ONCE
	}

	private boolean[] currentKeys = null;

	private KeyState[] keys = null;

	public KeyboardInput() {
		currentKeys = new boolean[KEY_COUNT];

		keys = new KeyState[KEY_COUNT];

		for (int i = 0; i < KEY_COUNT; ++i) {
			keys[i] = KeyState.RELEASED;
		}

	}

	public synchronized void poll() {
		for (int i = 0; i < KEY_COUNT; ++i) {
			if (currentKeys[i]) {

				if (keys[i] == KeyState.RELEASED)
					keys[i] = KeyState.ONCE;
				else
					keys[i] = KeyState.PRESSED;
			} else {

				keys[i] = KeyState.RELEASED;
			}
		}
	}

	public boolean keydown(int keycode) {
		return keys[keycode] == KeyState.ONCE ||
				keys[keycode] == KeyState.PRESSED;
	}

	public boolean keydownonce(int keycode) {
		return keys[keycode] == KeyState.ONCE;
	}

	public synchronized void keyPressed(KeyEvent e) {
		int keycode=e.getKeyCode();
		if(keycode>=0&&keycode<KEY_COUNT) {
			currentKeys[keycode]=true;
		}
	}

	public synchronized void keyReleased(KeyEvent e) {
		int keycode=e.getKeyCode();
		if(keycode>=0&&keycode<KEY_COUNT) {
			currentKeys[keycode]=false;
		}
	}

	public void keyTyped(KeyEvent e) {
		
	}
}
