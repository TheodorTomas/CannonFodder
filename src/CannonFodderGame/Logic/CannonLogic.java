/*Theodór Tómas Theodórsson, Bjarnþór 
 * Reykjavík University 
 * T-511-TGRA, Computer Graphics
 * 
 * 05.09.2014
 * Assignment 2
 * 
 */
package CannonFodderGame.Logic;

import CannonFodderGame.Objects.Cannon;

public class CannonLogic extends Cannon{
	
	public CannonLogic(){
		this.getBotLine().setX1(350);
		this.getBotLine().setY1(0);
		this.getBotLine().setX2(450);
		this.getBotLine().setY2(100);
		
		this.getLefLine().setX1(350);
		this.getLefLine().setY1(0);
		this.getLefLine().setX2(350);
		this.getLefLine().setY2(100);
		
		this.getRigLine().setX1(450);
		this.getRigLine().setY1(0);
		this.getRigLine().setX2(450);
		this.getRigLine().setY2(100);
		
		this.getTopLine().setX1(450);
		this.getTopLine().setY1(100);
		this.getTopLine().setX2(350);
		this.getTopLine().setY2(100);
		
		
//		shapeList.add(this.getBotLine());
//		shapeList.add(this.getTopLine());
//		shapeList.add(this.getLefLine());
//		shapeList.add(this.getRigLine());
	}
	public void cannonLogic(PlayerController pc){
//		Line tempLine = new Line();
//		tempLine = this.getTopLine();
//		
//		tempLine.setX1(x1);
		
	}
}
