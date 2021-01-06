package Wrappers;

import java.awt.Color;

//Utility class for working with colors
public class MyColor {
	private Color color;
	
	/**
	 * Constructor for the MyColor class
	 * @param r: red value for the color
	 * @param g: green value for the color
	 * @param b: blue value for the color
	 */
	public MyColor(int r, int g, int b) {
		color = new Color(r,g,b);
	}
	
	/**
	 * Constructor for the MyColor class. 
	 * @param color: Pre-constructed Color object
	 */
	public MyColor(Color color) {
		this.color = color;
	}
	
	/**
	 * Getter method for the MyColor class
	 * @return Color object associated with the instance of MyColor
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Method that inverts the color
	 */
	public void negate() {
		color = new Color(255 - color.getRed(),255 - color.getGreen(),255 - color.getBlue());
	}
	
	/**
	 * Method that averages the individual color values in order to make it a shade of gray
	 */
	public void grayscale() {
		int average = color.getRed() + color.getGreen() + color.getGreen();
		average /= 3;
		color = new Color(average,average,average);
	}
	
	/**
	 * Method that compares two colors and returns a color whose rgb values are the difference between the colors
	 * @param other color
	 * @return Color described above
	 */
	public Color colorDif(Color other) {
		return new Color(Math.max(0,color.getRed() - other.getRed()),Math.max(0,color.getGreen() - other.getGreen()),Math.max(0,color.getBlue() - other.getBlue()));
	}
	
	//static methods
	
	/**
	 * Static method that creates a random color
	 * @return random color
	 */
	public static Color randColor() {
		return new Color((int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256));
	}
	
}
