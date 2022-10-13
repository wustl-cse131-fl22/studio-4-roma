package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		Color cream = new Color (25, 50, 29);
		StdDraw.setPenColor(cream);
		
		StdDraw.filledRectangle(.5, .5, .5, .3);
		
		Color green = new Color (0, 142, 78);
		StdDraw.setPenColor(green);
		
		StdDraw.filledRectangle(.2, .7, .8, .05);
		StdDraw.filledRectangle(.2, .5, .05, .3);
		
		
		StdDraw.setPenColor(Color.black);
        StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(.5, .5, .5, .3);

		StdDraw.setPenColor(Color.red);
		StdDraw.filledCircle(.2, .7, .1);
		StdDraw.filledCircle(.5, .5, .05);
		StdDraw.filledCircle(.7, .4, .15);

		





	}
}