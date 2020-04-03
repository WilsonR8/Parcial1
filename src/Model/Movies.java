package Model;

import processing.core.PApplet;

public class Movies implements Comparable <Movies>{
	private String name, date,id,rate;
	private int posX;
	private int posY;
	private PApplet app;

	public Movies(String name, String date, String rate, String id, PApplet app) {
		this.name = name;
		this.date = date;
		this.rate = rate;
		this.id = id;
		this.posX = 30;
		this.app = app;
	}

	public void paintM(int posY, PApplet app) {
		app.fill(255);

		app.text("Rate", 50, 45);
		app.text(this.rate, posX, posY);

		app.text("Name", 100, 45);
		app.text(this.name, posX + 50, posY);

		app.text("Date", 190, 45);
		app.text(this.date, posX + 150, posY);

		app.text("Id", 280, 45);
		app.text(this.id, posX + 200, posY);

	}



	

	//Getters & Setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRate() {
			return rate;
		}

		public void setRate(String rate) {
			this.rate=rate;
		}

		public String getDate1() {
			return date;
		}

		public void setDate1( String date) {
			this.date = date;
		}

		public int getPosX() {
			return posX;
		}

		public void setPosX(int posX) {
			this.posX = posX;
		}

		public int getPosY() {
			return posY;
		}

		public void setPosY(int posY) {
			this.posY = posY;
		}

		public PApplet getApp() {
			return app;
		}

		public void setApp(PApplet app) {
			this.app = app;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		@Override
		public int compareTo(Movies mov) {
			// TODO Auto-generated method stub
			return rate.compareTo(mov.getRate());
		}

	
	
}