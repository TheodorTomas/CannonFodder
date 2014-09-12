package CannonFodderGame.Logic;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL11;

import CannonFodderGame.Objects.Line;
import CannonFodderGame.Objects.Shape;

public class LineLogic extends Line{
	
	private Boolean firstClick;
	public LineLogic(){
		firstClick = true;
		
	}
	
	public void lineLogic(ArrayList<Shape> shapeList){
		if(Gdx.input.isButtonPressed(Input.Buttons.RIGHT) && firstClick){
			firstClick = false;
			this.setX1(Gdx.input.getX());
			this.setY1(Gdx.input.getY());
			this.setX2(Gdx.input.getX());
			this.setY2(Gdx.input.getY());
			shapeList.add(this);
			
			System.out.println("adding new line");
		}
		else if(Gdx.input.isButtonPressed(Input.Buttons.RIGHT) && !firstClick){
			this.setX2(Gdx.input.getX());
			this.setY2(Gdx.input.getY());
			System.out.println("drawing line");
		}
		else if(!Gdx.input.isButtonPressed(Input.Buttons.RIGHT) && !firstClick){
			firstClick = true;
			Line newLine = new Line();
			newLine.setX1(this.getX1());
			newLine.setX2(this.getX2());
			newLine.setY1(Gdx.graphics.getHeight() -  this.getY1());
			newLine.setY2(Gdx.graphics.getHeight() -  this.getY2());
			shapeList.add(newLine);
			System.out.println("new line created");
		}
	}
	
}
