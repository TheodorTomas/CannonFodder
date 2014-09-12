package CannonFodderGame.Objects;

import com.badlogic.gdx.graphics.GL11;

public class Box extends Shape{
	private float lineWidth;
	public Box(){
		lineWidth = (float) 2.5;	
		this.setShapeType(GL11.GL_LINE_STRIP);
	}
	public float getLineWidth(){
		return this.lineWidth;
	}
}
