/*Theodór Tómas Theodórsson, Bjarnþór 
 * Reykjavík University 
 * T-511-TGRA, Computer Graphics
 * 
 * 05.09.2014
 * Assignment 2
 * 
 */
package CannonFodderGame.Logic;
import java.util.ArrayList;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import CannonFodderGame.Objects.Box;
import CannonFodderGame.Objects.Shape;

public class BoxLogic extends Box{
	private Boolean firstClick;
	private Shape tempBot;
	private Shape tempTop;
	private Shape tempLef;
	private Shape tempRig;
	
	
	public BoxLogic(){
		this.firstClick = true;
	}
	public void boxLogic(ArrayList<Shape> shapeList){
		if(Gdx.input.isButtonPressed(Input.Buttons.LEFT) && firstClick){
			firstClick = false; 
			
			
			this.getTopLine().setX1(Gdx.input.getX());
			this.getTopLine().setY1(Gdx.graphics.getHeight() - Gdx.input.getY());
			this.getTopLine().setX2(Gdx.input.getX());
			this.getTopLine().setY2(Gdx.graphics.getHeight() - Gdx.input.getY());
			
			this.getBotLine().setX1(Gdx.input.getX());
			this.getBotLine().setY1(Gdx.graphics.getHeight() - Gdx.input.getY());
			this.getBotLine().setX2(Gdx.input.getX());
			this.getBotLine().setY2(Gdx.graphics.getHeight() - Gdx.input.getY());
			
			this.getRigLine().setX1(Gdx.input.getX());
			this.getRigLine().setY1(Gdx.graphics.getHeight() - Gdx.input.getY());
			this.getRigLine().setX2(Gdx.input.getX());
			this.getRigLine().setY2(Gdx.graphics.getHeight() - Gdx.input.getY());
			
			this.getLefLine().setX1(Gdx.input.getX());
			this.getLefLine().setY1(Gdx.graphics.getHeight() - Gdx.input.getY());
			this.getLefLine().setX2(Gdx.input.getX());
			this.getLefLine().setY2(Gdx.graphics.getHeight() - Gdx.input.getY());
			
			shapeList.add(this.getBotLine());
			shapeList.add(this.getTopLine());
			shapeList.add(this.getLefLine());
			shapeList.add(this.getRigLine());
			
			System.out.println("adding new box");
		}
		else if(Gdx.input.isButtonPressed(Input.Buttons.LEFT) && !firstClick){
			this.tempBot = shapeList.get(0);
			this.tempTop = shapeList.get(1);
			this.tempLef = shapeList.get(2);
			this.tempRig = shapeList.get(3);
			
			tempBot.setX2(Gdx.input.getX());
			tempLef.setY2(Gdx.graphics.getHeight() - Gdx.input.getY());
			
			tempRig.setX1(Gdx.input.getX());
			tempRig.setX2(Gdx.input.getX());
			tempRig.setY2(Gdx.graphics.getHeight() - Gdx.input.getY());
			
			tempTop.setX1(tempBot.getX1());
			tempTop.setX2(tempBot.getX2());
			tempTop.setY1(Gdx.graphics.getHeight() - Gdx.input.getY());
			tempTop.setY2(Gdx.graphics.getHeight() - Gdx.input.getY());
			
			System.out.println("drawing box");
		}
		else if(!Gdx.input.isButtonPressed(Input.Buttons.LEFT) && !firstClick){
			firstClick = true;
			Box newBox = new Box();
			
			newBox.getTopLine().setX1(this.getTopLine().getX1());
			newBox.getTopLine().setY1(this.getTopLine().getY1());
			newBox.getTopLine().setX2(this.getTopLine().getX2());
			newBox.getTopLine().setY2(this.getTopLine().getY2());
			
			newBox.getBotLine().setX1(this.getBotLine().getX1());
			newBox.getBotLine().setY1(this.getBotLine().getY1());
			newBox.getBotLine().setX2(this.getBotLine().getX2());
			newBox.getBotLine().setY2(this.getBotLine().getY2());
			
			newBox.getRigLine().setX1(this.getRigLine().getX1());
			newBox.getRigLine().setY1(this.getRigLine().getY1());
			newBox.getRigLine().setX2(this.getRigLine().getX2());
			newBox.getRigLine().setY2(this.getRigLine().getY2());
			
			newBox.getLefLine().setX1(this.getLefLine().getX1());
			newBox.getLefLine().setY1(this.getLefLine().getY1());
			newBox.getLefLine().setX2(this.getLefLine().getX2());
			newBox.getLefLine().setY2(this.getLefLine().getY2());
			
			shapeList.add(newBox.getBotLine());
			shapeList.add(newBox.getTopLine());
			shapeList.add(newBox.getLefLine());
			shapeList.add(newBox.getRigLine());
			
			System.out.println("new box created");
		}
	}
	public Boolean getFirstClick() {
		return firstClick;
	}
	public void setFirstClick(Boolean firstClick) {
		this.firstClick = firstClick;
	}	}
