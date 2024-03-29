/*Theod�r T�mas Theod�rsson, Bjarn��r 
 * Reykjav�k University 
 * T-511-TGRA, Computer Graphics
 * 
 * 05.09.2014
 * Assignment 2
 * 
 */
package CannonFodderGame;
import CannonFodderGame.Logic.*;
import CannonFodderGame.Objects.*;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.utils.BufferUtils;

import java.nio.FloatBuffer;
import java.util.ArrayList;
public class GameEngine implements ApplicationListener {
		Cannon cannon;
		CannonLogic cannonLogic;
		PlayerController controller;
		LineLogic lines;
		BoxLogic boxes;
		ArrayList<Shape> shapeList;
		
		
		FloatBuffer vertexBuffer;
		@Override
		public void render() {
			controller.aimLogic();
			lines.lineLogic(this.shapeList);
			boxes.boxLogic(this.shapeList);
			
			Gdx.gl11.glClear(GL11.GL_COLOR_BUFFER_BIT);			 	 
			Gdx.gl11.glMatrixMode(GL11.GL_MODELVIEW);
			Gdx.gl11.glLoadIdentity();
			Gdx.glu.gluOrtho2D(Gdx.gl10, 0, 800, 0, 600);
			Gdx.gl11.glColor4f(0.6f, 0.0f, 0.0f, 1.0f);
			Gdx.gl11.glVertexPointer(2, GL11.GL_FLOAT, 0, vertexBuffer);
			
			
//			//This draws the cannon
//			Gdx.gl11.glPushMatrix();		
//				//Sets the color for the cannon.
//				Gdx.gl11.glColor4f(cannon.getCannonColor().getRed(), cannon.getCannonColor().getGreen(),
//						cannon.getCannonColor().getBlue(),cannon.getCannonColor().getAlpha());
//				Gdx.gl11.glTranslatef(controller.getAim(), cannon.getY1(), 0);
//				Gdx.gl11.glDrawArrays(GL11.GL_TRIANGLE_STRIP, 0, 4);
//			Gdx.gl11.glPopMatrix();
			
			
			//This draws each line created by mouse clicks
			//TODO: fill out the boxes using org.lwjgl.opengl.GL11.GL_QUADS
			for(Shape s : shapeList){
				org.lwjgl.opengl.GL11.glColor4f(s.getShapeColor().getRed(), s.getShapeColor().getGreen(),
						s.getShapeColor().getBlue(), s.getShapeColor().getAlpha());
				org.lwjgl.opengl.GL11.glBegin(s.getShapeType());					
					org.lwjgl.opengl.GL11.glVertex2f(s.getX1(), s.getY1());
					org.lwjgl.opengl.GL11.glVertex2f(s.getX2(), s.getY2());
					org.lwjgl.opengl.GL11.glEnd();
			}
			org.lwjgl.opengl.GL11.glBegin(org.lwjgl.opengl.GL11.GL_QUADS);
			org.lwjgl.opengl.GL11.glColor4f(cannon.getShapeColor().getRed(), cannon.getShapeColor().getGreen(),
					cannon.getShapeColor().getBlue(), cannon.getShapeColor().getAlpha());
				org.lwjgl.opengl.GL11.glVertex2f(cannon.getBotLine().getX1(),cannon.getBotLine().getY1());
				org.lwjgl.opengl.GL11.glVertex2f(cannon.getTopLine().getX2(),cannon.getTopLine().getY2());
				org.lwjgl.opengl.GL11.glVertex2f(cannon.getTopLine().getX1(),cannon.getTopLine().getY1());
				org.lwjgl.opengl.GL11.glVertex2f(cannon.getRigLine().getX1(),cannon.getRigLine().getY1());
			org.lwjgl.opengl.GL11.glEnd();
		}
		//This function is called on startup.
		@Override
		public void create() {
			cannon = new CannonLogic();
			lines = new LineLogic();
			boxes = new BoxLogic();
			controller = new PlayerController();
			shapeList = new ArrayList<Shape>();
			
			Gdx.gl11.glEnableClientState(GL11.GL_VERTEX_ARRAY);
			Gdx.gl11.glClearColor(0.4f, 0.6f, 1.0f, 1.0f);
			vertexBuffer = BufferUtils.newFloatBuffer(8);
			vertexBuffer.put(new float[] {-50,-50, -50,50, 50,-50, 50,50});
			vertexBuffer.rewind();
		}
		@Override
		public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		 
		}
		
		@Override
		public void resume() {
		// TODO Auto-generated method stub
		 
		}
		
		@Override
		public void dispose() {
		// TODO Auto-generated method stub
		 
		}
		
		@Override
		public void pause() {
		// TODO Auto-generated method stub
		 
		}

	
}
