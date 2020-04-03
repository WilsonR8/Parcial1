package Controller;

import java.util.LinkedList;

import Model.Movies;
import Model.Logic;
import processing.core.PApplet;

public class LogicControl {
	public PApplet app;
	Logic LogicControl;
	
	public LogicControl (PApplet app) {
		LogicControl = new Logic (app);
	}
	
	public LinkedList<Movies> movies () {
		return LogicControl.getMovies();
	}
	
	public void sortListController (char i) {
		LogicControl.sortList(i);
	}
	
	

}
