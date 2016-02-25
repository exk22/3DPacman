import java.awt.Color;

public class Ghost extends Movable{

	private Color gColor;
	
	public Ghost(int x, int y)
	{
		super(x,y);
	}
	public void setColor(Color c)
	{
		gColor = c;
	}
	
	// TAKES A PACMAN OBJECT, AND IF ITS "X" AND "Y" POSITION ARE THE SAME AS THE GHOST RETURNS TRUE
	public isEatenBy(Pacman p){
		
		if (p.getX() ==xPos && p.getY()== yPos)
			return true;
		
		else 
			return false;
		
	}
}
