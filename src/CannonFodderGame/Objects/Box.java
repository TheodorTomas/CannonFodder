/*Theodór Tómas Theodórsson, Bjarnþór 
 * Reykjavík University 
 * T-511-TGRA, Computer Graphics
 * 
 * 05.09.2014
 * Assignment 2
 * 
 */
package CannonFodderGame.Objects;
import com.badlogic.gdx.Gdx;

public class Box extends Shape{
	private Line botLine;
	private Line rigLine;
	private Line topLine;
	private Line lefLine;
	
	public Box(){
		this.setShapeType(org.lwjgl.opengl.GL11.GL_QUADS);
		
		System.out.println("hello");
		this.botLine = new Line();
		this.botLine.setX1(Gdx.input.getX());
		this.botLine.setY1(Gdx.graphics.getHeight() -  Gdx.input.getY());
		this.botLine.setX2(Gdx.input.getX());
		this.botLine.setY2(Gdx.graphics.getHeight() -  Gdx.input.getY());
	
		this.rigLine = new Line();
		this.rigLine.setX1(Gdx.input.getX());
		this.rigLine.setY1(Gdx.graphics.getHeight() -  Gdx.input.getY());
		this.rigLine.setX2(Gdx.input.getX());
		this.rigLine.setY2(Gdx.graphics.getHeight() -  Gdx.input.getY());
		
		this.topLine = new Line();
		this.topLine.setX1(Gdx.input.getX());
		this.topLine.setY1(Gdx.graphics.getHeight() -  Gdx.input.getY());
		this.topLine.setX2(Gdx.input.getX());
		this.topLine.setY2(Gdx.graphics.getHeight() -  Gdx.input.getY());
		
		this.lefLine = new Line();
		this.lefLine.setX1(Gdx.input.getX());
		this.lefLine.setY1(Gdx.input.getY());
		this.lefLine.setX2(Gdx.input.getX());
		this.lefLine.setY2(Gdx.input.getY());
		
	}
	public Line getBotLine(){return this.botLine;}
	public Line getLefLine(){return this.lefLine;}
	public Line getTopLine(){return this.topLine;}
	public Line getRigLine(){return this.rigLine;}	
}
