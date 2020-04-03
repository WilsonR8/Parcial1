package View;

import Controller.LogicControl;
import processing.core.PApplet;

public class Main extends PApplet {

	LogicControl Paint;
	LogicControl ListM;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PApplet.main("View.Main");
	}

	
	public void settings() {
		size(500,500);
	}
	
	
	public void setup() {
		Paint = new LogicControl(this);
		ListM = new LogicControl(this);
	}

	public void draw() {
		background(0);
		
		

		for (int i = 0; i < Paint.movies().size(); i++) {
			Paint.movies().get(i).paintM((i * (30)) + 80, this);
		}
	}
	
	
	
	
	
	
	
	
	
}
