package CannonFodderGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopRunner {
	public static void main(String[] args) {
		new LwjglApplication(new GameEngine(), "Cannon", 800, 600, false);
	}
}
