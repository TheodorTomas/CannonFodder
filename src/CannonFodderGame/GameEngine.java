/*Theodór Tómas Theodórsson, Bjarnþór 
 * Reykjavík University 
 * T-511-TGRA, Computer Graphics
 * 
 * 05.09.2014
 * Assignment 2
 * 
 */
package CannonFodderGame;
import CannonFodderGame.Logic.CannonLogic;
import CannonFodderGame.Objects.Cannon;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL11;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.utils.BufferUtils;

import java.nio.FloatBuffer;
import java.util.ArrayList;
public class GameEngine implements ApplicationListener {
		CannonLogic cannon;
		FloatBuffer vertexBuffer;
		@Override
		public void render() {
			Gdx.gl11.glClear(GL11.GL_COLOR_BUFFER_BIT);
				 	 
			Gdx.gl11.glMatrixMode(GL11.GL_MODELVIEW);
			Gdx.gl11.glLoadIdentity();
			Gdx.glu.gluOrtho2D(Gdx.gl10, 0, 800, 0, 600);
			 
			Gdx.gl11.glColor4f(0.6f, 0.0f, 0.0f, 1.0f);
			
			Gdx.gl11.glVertexPointer(2, GL11.GL_FLOAT, 0, vertexBuffer);
			
			
			Gdx.gl11.glPushMatrix();
			Gdx.gl11.glTranslatef(0, 1, 0);
			Gdx.gl11.glColor4f(0, 1, 1, 0);
			Gdx.gl11.glDrawArrays(GL11.GL_TRIANGLE_STRIP, 0, 4);
			Gdx.gl11.glPopMatrix();
					 
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
		public void create() {
			cannon = new CannonLogic();
			Gdx.gl11.glEnableClientState(GL11.GL_VERTEX_ARRAY);
			Gdx.gl11.glClearColor(0.4f, 0.6f, 1.0f, 1.0f);
			vertexBuffer = BufferUtils.newFloatBuffer(8);
			vertexBuffer.put(new float[] {-50,-50, -50,50, 50,-50, 50,50});
			vertexBuffer.rewind();
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
