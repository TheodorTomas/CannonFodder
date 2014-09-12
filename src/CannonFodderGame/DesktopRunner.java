/*Theodór Tómas Theodórsson, Bjarnþór 
 * Reykjavík University 
 * T-511-TGRA, Computer Graphics
 * 
 * 05.09.2014
 * Assignment 2
 * 
 */
package CannonFodderGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopRunner {
	public static void main(String[] args) {
		new LwjglApplication(new GameEngine(), "Cannon", 800, 600, false);
	}
}
