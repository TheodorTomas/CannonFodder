/*Theodór Tómas Theodórsson, Bjarnþór 
 * Reykjavík University 
 * T-511-TGRA, Computer Graphics
 * 
 * 05.09.2014
 * Assignment 2
 * 
 */
package CannonFodderGame.Objects;
import com.badlogic.gdx.graphics.GL11;

public class Line extends Shape{
	private float lineWidth;
	
	public Line(){
		lineWidth = (float) 1;	
		this.setShapeType(GL11.GL_LINE_STRIP);
	}
	public Line getLine(){
		return this;
	}
	public float getLineWidth(){
		return this.lineWidth;
	}}
