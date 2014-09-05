package CannonFodderGame.HelperFunctions;

public class Color {
	private float red;
	private float green;
	private float blue;
	private float alpha;
	
	public Color(float _red, float _green, float _blue, float _alpha)
	{
		this.setRed(_red);
		this.setGreen(_green);
		this.setBlue(_blue);
		this.setAlpha(_alpha);
		
	}

	public float getRed() {
		return red;
	}

	public void setRed(float red) {
		this.red = red;
	}

	public float getGreen() {
		return green;
	}

	public void setGreen(float green) {
		this.green = green;
	}

	public float getBlue() {
		return blue;
	}

	public void setBlue(float blue) {
		this.blue = blue;
	}

	public float getAlpha() {
		return alpha;
	}

	public void setAlpha(float alpha) {
		this.alpha = alpha;
	}
}
