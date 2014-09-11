package CannonFodderGame.Logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import CannonFodderGame.Objects.Shape;

public class LineLogic extends Shape{
	private float lineWidth;
	private Boolean firstClick;
	
	public LineLogic(){
		lineWidth = (float) 2.5;
		firstClick = true;
	}
	
	public void lineLogic(){
		if(Gdx.input.isButtonPressed(Input.Buttons.RIGHT) && firstClick){
			firstClick = false;
			this.setX1(Gdx.input.getX());
			this.setY1(Gdx.input.getY());

			System.out.println(this.getY1());
		}
		else if(Gdx.input.isButtonPressed(Input.Buttons.RIGHT) && !firstClick){
			this.setX2(Gdx.input.getX());
			this.setY2(Gdx.input.getY());
			System.out.println(this.getY2());
		}
		else if(!Gdx.input.isButtonPressed(Input.Buttons.RIGHT) && !firstClick){
			firstClick = true;
		}
	}
	public float getLineWidth(){
		return this.lineWidth;
	}
}
