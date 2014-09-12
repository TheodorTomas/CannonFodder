package CannonFodderGame.Objects;

import com.badlogic.gdx.graphics.GL11;

public class Line extends Shape{
	private float lineWidth;
	public Line(){
		lineWidth = (float) 2.5;	
		this.setShapeType(GL11.GL_LINE_STRIP);
	}
	public float getLineWidth(){
		return this.lineWidth;
	}
}
