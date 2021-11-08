
public abstract class Shapes {
	
	public abstract void draw();

}

class Line extends Shapes{

	@Override
	public void draw() {
		for(int i=0;i<50;i++) {
			System.out.print("-");
		}
	}
	
}

class Rectangle extends Shapes{

	@Override
	public void draw() {
		for(int j=0;j<5;j++) {
			for(int i=0;i<10;i++)
			{
				if(j==0 || j==4 || i==0 || i==9)
					System.out.print("-");
			}
			System.out.println();
		}
		
		
		
	}
	
}

class Cube extends Shapes{

	@Override
	public void draw() {
		System.out.println("Drawing Cube");
		
	}
	
}