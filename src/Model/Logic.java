package Model;


import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private String[] data1;
	private String[] txtsplit1;
	private LinkedList<Movies> movies;
	private int rate;
	private String name;
	private String date;
	private String id;
	public PApplet app;

	public Logic(PApplet app) {
		this.app = app;

		data1 = app.loadStrings("data/netflix.txt");

		movies = new LinkedList<Movies>();
		setM();

	}

	private void setM() {
		for (int i = 0; i < data1.length; i++) {
			txtsplit1 = data1[i].split(",");

			name = txtsplit1[0];
			date = txtsplit1[1];
			rate = Integer.parseInt (txtsplit1[2]);
			id = txtsplit1[3];

			movies.add(new Movies(name, date,rate, id, app));

		}
	}

	public LinkedList<Movies> getMovies() {
		return movies;
	}

	public void setMovies(LinkedList<Movies> movies) {
		this.movies = movies;
	}

	public void sortList (char i) {
		switch (i) {
		case 'i': 
			Collections.sort(movies);
			System.out.println("hhhh");
			break;
		}

}
}