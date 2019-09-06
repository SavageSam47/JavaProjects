package housewithsunrise;
/**
 * Write a description of class MyPicture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyPicture
{
 
public static void main (String [] args)
{
   Circle c1 = new Circle();
   c1.makeVisible();
   c1.moveDown();
   c1.moveRight();
   c1.slowMoveHorizontal(100);
   c1.changeColor("red");
   
   Circle c2 = new Circle();
   c2.makeVisible();
   
   Square s1 = new Square();
   s1.makeVisible();
   s1.slowMoveVertical(100);
   s1.changeSize(100);
   //System.out.println("Hello world!");
}

}