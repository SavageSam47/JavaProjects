package housewithsunrise;

public class HouseWithSunrise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square building = new Square();
		building.changeSize(350);
		building.makeVisible();
		building.moveVertical(200);
		building.changeColor("blue");
		
		Triangle roof = new Triangle();
		roof.makeVisible();
		roof.changeSize(200, 350);
		roof.moveHorizontal(185);
		roof.moveVertical(35);
		
		Square doorTop = new Square();
		doorTop.makeVisible();
		doorTop.moveHorizontal(145);
		doorTop.changeSize(60);
		doorTop.moveVertical(490);
		
		Square doorb = new Square();
		doorb.makeVisible();
		doorb.moveHorizontal(145);
		doorb.changeSize(60);
		doorb.moveVertical(440);
		
		Square rightW = new Square();
		rightW.makeVisible();
		rightW.moveHorizontal(50);
		rightW.changeSize(60);
		rightW.moveVertical(350);
		
		Square leftW = new Square();
		leftW.makeVisible();
		leftW.moveHorizontal(240);
		leftW.changeSize(60);
		leftW.moveVertical(350);
		
		Circle sun = new Circle();
		sun.changeColor("yellow");
		sun.makeVisible();
		sun.moveHorizontal(450);
		sun.moveVertical(510);
		sun.slowMoveVertical(-490);
		
	}

}
