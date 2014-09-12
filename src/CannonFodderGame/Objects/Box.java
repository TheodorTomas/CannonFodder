package CannonFodderGame.Objects;

import java.util.ArrayList;

import CannonFodderGame.Logic.LineLogic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL11;

public class Box extends Shape{
	private Line botLine;
	private Line rigLine;
	private Line topLine;
	private Line lefLine;
	
	public Box(){
		
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
