package endless.model;

public class Player {

	public static final int JUMP_SPEED = 300;
	public static final int WIDTH = 30;
	public static final int NORMAL_HEIGHT = 60;
	public static final int CRAWL_HEIGHT = 30;
	
	private int x;
	private int y;
	private int vY;
	private int width;
	private int height;

	// TODO: Add variables you need.

	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = WIDTH;
		this.height = NORMAL_HEIGHT;
		// TODO: Initialize variables you need
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getvY() {
		return vY;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setvY(int vY) {
		this.vY = vY;
	}

	public void jumpPressed() {
		// TODO: Complete this
		System.out.println("Jump Pressed");
	}

	public void crawlPressed() {
		// TODO: Complete this
		System.out.println("Crawl Pressed");
	}

	public void crawlReleased() {
		// TODO: Complete this
		System.out.println("Crawl Released");
	}

	public void update() {
		// TODO: Complete this
	}

}
