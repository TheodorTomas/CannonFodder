package CannonFodderGame.Objects;

import CannonFodderGame.Logic.CannonLogic;
import CannonFodderGame.HelperFunctions.*;
public class Cannon{
	private Color cannonColor = new Color(0,0,0,1);
	
	private int X1 = 400;
	private int X2 = 450;
	
	private int Y1 = 0;	
	private int Y2 = 200;
	
	public Cannon(){}
	public Cannon (int x1, int x2, int y1, int y2){
		this.setX1(x1);
		this.setX2(x2);
		this.setY1(y1);
		this.setY2(y2);
		
	}

	public int getX1() {
		return X1;
	}

	public void setX1(int x1) {
		X1 = x1;
	}

	public int getX2() {
		return X2;
	}

	public void setX2(int x2) {
		X2 = x2;
	}

	public int getY1() {
		return Y1;
	}

	public void setY1(int y1) {
		Y1 = y1;
	}

	public int getY2() {
		return Y2;
	}

	public void setY2(int y2) {
		Y2 = y2;
	}
	public Color getCannonColor() {
		return cannonColor;
	}
	public void setCannonColor(Color cannonColor) {
		this.cannonColor = cannonColor;
	}

	
}
