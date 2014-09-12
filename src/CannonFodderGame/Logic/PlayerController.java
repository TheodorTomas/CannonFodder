/*Theodór Tómas Theodórsson, Bjarnþór 
 * Reykjavík University 
 * T-511-TGRA, Computer Graphics
 * 
 * 05.09.2014
 * Assignment 2
 * 
 */
package CannonFodderGame.Logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class PlayerController {
	private float aim;
	
	//Change to correspond with the window size
	public PlayerController(){
		this.setAim(400);	
	}
	public void aimLogic(){
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT) && this.aim > 5)
		{
			this.aim -= 5;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) && this.aim < Gdx.graphics.getWidth() - 5){
			this.aim += 5;
		}
	}
	
	public float getAim() {
		return aim;
	}

	public void setAim(float aim) {
		this.aim = aim;
	}
	
}
