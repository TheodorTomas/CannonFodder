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
