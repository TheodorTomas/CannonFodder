/*Theod�r T�mas Theod�rsson, Bjarn��r 
 * Reykjav�k University 
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
		//Can be used to draw a rectangle.
		this.setShapeType(org.lwjgl.opengl.GL11.GL_QUADS);
		
		//This sets the bottom line of the box.
		this.botLine = new Line();
		this.botLine.setX1(Gdx.input.getX());
		this.botLine.setY1(Gdx.input.getY());
		this.botLine.setX2(Gdx.input.getX());
		this.botLine.setY2(Gdx.input.getY());
		
		//This sets the right line of the box
		this.rigLine = new Line();
		this.rigLine.setX1(Gdx.input.getX());
		this.rigLine.setY1(Gdx.input.getY());
		this.rigLine.setX2(Gdx.input.getX());
		this.rigLine.setY2(Gdx.input.getY());
		
		//this sets the top line of the box.
		this.topLine = new Line();
		this.topLine.setX1(Gdx.input.getX());
		this.topLine.setY1(Gdx.input.getY());
		this.topLine.setX2(Gdx.input.getX());
		this.topLine.setY2(Gdx.input.getY());
		
		//This sets the left line of the box
		this.lefLine = new Line();
		this.lefLine.setX1(Gdx.input.getX());
		this.lefLine.setY1(Gdx.input.getY());
		this.lefLine.setX2(Gdx.input.getX());
		this.lefLine.setY2(Gdx.input.getY());
		
	}
	//Getters for each side of the box.
	public Line getBotLine(){return this.botLine;}
	public Line getLefLine(){return this.lefLine;}
	public Line getTopLine(){return this.topLine;}
	public Line getRigLine(){return this.rigLine;}	
}
