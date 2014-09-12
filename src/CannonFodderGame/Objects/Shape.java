package CannonFodderGame.Objects;

import java.util.Random;

import com.badlogic.gdx.Gdx;

import CannonFodderGame.HelperFunctions.Color;

public class Shape {
	private float x1;
	private float y1;
	private float x2;
	private float y2;
	private int shapeType;
	
	private Random rnd = new Random();
	private Color shapeColor = new Color(rnd.nextFloat(),rnd.nextFloat(),rnd.nextFloat(),rnd.nextFloat());
	
	public Shape(){
		this.setX1(0);
		this.setX2(0);
		this.setY1(0);
		this.setY2(0);
		
	}
	
	
	public float getX1() {
		return x1;
	}
	public void setX1(float x1) {
		this.x1 = x1;
	}


	public float getY1() {
		return y1;
	}


	public void setY1(float y1) {
		this.y1 = Gdx.graphics.getHeight() -  y1;
	}


	public float getX2() {
		return x2;
	}


	public void setX2(float x2) {
		this.x2 = x2;
	}


	public float getY2() {
		return y2;
	}


	public void setY2(float y2) {
		this.y2 = Gdx.graphics.getHeight() - y2;
	}


	public Color getShapeColor() {
		return shapeColor;
	}


	public void setShapeColor(Color shapeColor) {
		this.shapeColor = shapeColor;
	}


	public int getShapeType() {
		return shapeType;
	}


	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;
	}

	
	

}
