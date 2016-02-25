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
	
	public isEatenBy(Pacman p){
		
		if (p.getX() ==xPos && p.getY()== yPos)
			return true;
		
		else 
			return false;
		
	}
}
