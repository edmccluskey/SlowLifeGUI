import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class GOLtest {

	@Test
	public void testgetNumNeighbors() {
		MainPanel m=new MainPanel(15);
		Random rand;
		rand= new Random();
		int retval;
		int x=rand.nextInt(15);
		int y=rand.nextInt(15);
		retval=m.getNumNeighbors(x,y);
		System.out.println(retval);
	}
	@Test
	public void TestConverttoInt1 ()
	{
		MainPanel m = new MainPanel(10);
		int retval;
		for (int x=0;x<=8;x++)
		{
			retval=m.convertToInt(x);
			System.out.println(retval);
		}
		
	}
	@Test
	public void TestConverttoInt2 ()
	{
		MainPanel m = new MainPanel(15);
		int retval;
		for (int x=0;x<=8;x++)
		{
			retval=m.convertToInt(x);
			System.out.println(retval);
		}
		
	}
	@Test
	public void TestConverttoInt3 ()
	{
		MainPanel m = new MainPanel(20);
		int retval;
		for (int x=0;x<=8;x++)
		{
			retval=m.convertToInt(x);
			System.out.println(retval);
		}
	}
	@Test
	public void TestgetNumNeighborsrand1 ()
	{
		MainPanel m = new MainPanel(10);
		int retval;
		//set pseudo-random board
		for (int x=0;x<=9;x++)
		{
			for (int y=0;y<=9;y++)
			{
				if (x%3==1)
					m._cells[x][y].setAlive(true);
				if (y%2==1)
					m._cells[x][y].setAlive(true);
				else
					m._cells[x][y].setAlive(false);
			}
		}
		for (int x=0;x<=9;x++)
		{
			for (int y=0;y<=9;y++)
			{
				retval=m.getNumNeighbors(x,y);
				System.out.print(retval);
			}
			System.out.println();
		}
	}
	@Test
	public void TestgetNumNeighborsrand2 ()
	{
		MainPanel m = new MainPanel(20);
		int retval;
		//set pseudo-random board
		for (int x=0;x<=19;x++)
		{
			for (int y=0;y<=19;y++)
			{
				if (x%3==1)
					m._cells[x][y].setAlive(true);
				if (y%2==1)
					m._cells[x][y].setAlive(true);
				else
					m._cells[x][y].setAlive(false);
			}
		}
		for (int x=0;x<=19;x++)
		{
			for (int y=0;y<=19;y++)
			{
				retval=m.getNumNeighbors(x,y);
				System.out.print(retval);
			}
			System.out.println();
		}
	}
	@Test
	public void TestgetNumNeighborsrand3 ()
	{
		MainPanel m = new MainPanel(15);
		int retval;
		//set pseudo-random board
		for (int x=0;x<=14;x++)
		{
			for (int y=0;y<=14;y++)
			{
				if (x%3==1)
					m._cells[x][y].setAlive(true);
				if (y%2==1)
					m._cells[x][y].setAlive(true);
				else
					m._cells[x][y].setAlive(false);
			}
		}
		for (int x=0;x<=14;x++)
		{
			for (int y=0;y<=14;y++)
			{
				retval=m.getNumNeighbors(x,y);
				System.out.print(retval);
			}
			System.out.println();
		}
	}
	@Test
	public void TestgetNumNeighborsempty1 ()
	{
		MainPanel m = new MainPanel(10);
		int retval;
		//set pseudo-random board
		for (int x=0;x<=9;x++)
		{
			for (int y=0;y<=9;y++)
			{
					m._cells[x][y].setAlive(false);
			}
		}
		for (int x=0;x<=9;x++)
		{
			for (int y=0;y<=9;y++)
			{
				retval=m.getNumNeighbors(x,y);
				System.out.print(retval);
			}
			System.out.println();
		}
	}
	@Test
	public void TestgetNumNeighborsempty2 ()
	{
		MainPanel m = new MainPanel(20);
		int retval;
		//set pseudo-random board
		for (int x=0;x<=19;x++)
		{
			for (int y=0;y<=19;y++)
			{
				m._cells[x][y].setAlive(false);
			}
		}
		for (int x=0;x<=19;x++)
		{
			for (int y=0;y<=19;y++)
			{
				retval=m.getNumNeighbors(x,y);
				System.out.print(retval);
			}
			System.out.println();
		}
	}
	@Test
	public void TestgetNumNeighborsempty3 ()
	{
		MainPanel m = new MainPanel(15);
		int retval;
		//set pseudo-random board
		for (int x=0;x<=14;x++)
		{
			for (int y=0;y<=14;y++)
			{
				m._cells[x][y].setAlive(false);
			}
		}
		for (int x=0;x<=14;x++)
		{
			for (int y=0;y<=14;y++)
			{
				retval=m.getNumNeighbors(x,y);
				System.out.print(retval);
			}
			System.out.println();
		}
	}
	@Test
	public void TestgetNumNeighborsfull1 ()
	{
		MainPanel m = new MainPanel(10);
		int retval;
		//set pseudo-random board
		for (int x=0;x<=9;x++)
		{
			for (int y=0;y<=9;y++)
			{
					m._cells[x][y].setAlive(true);
			}
		}
		for (int x=0;x<=9;x++)
		{
			for (int y=0;y<=9;y++)
			{
				retval=m.getNumNeighbors(x,y);
				System.out.print(retval);
			}
			System.out.println();
		}
	}
	@Test
	public void TestgetNumNeighborsfull2 ()
	{
		MainPanel m = new MainPanel(20);
		int retval;
		//set pseudo-random board
		for (int x=0;x<=19;x++)
		{
			for (int y=0;y<=19;y++)
			{
				m._cells[x][y].setAlive(true);
			}
		}
		for (int x=0;x<=19;x++)
		{
			for (int y=0;y<=19;y++)
			{
				retval=m.getNumNeighbors(x,y);
				System.out.print(retval);
			}
			System.out.println();
		}
	}
	@Test
	public void TestgetNumNeighborsfull3 ()
	{
		MainPanel m = new MainPanel(15);
		int retval;
		//set pseudo-random board
		for (int x=0;x<=14;x++)
		{
			for (int y=0;y<=14;y++)
			{
				m._cells[x][y].setAlive(true);
			}
		}
		for (int x=0;x<=14;x++)
		{
			for (int y=0;y<=14;y++)
			{
				retval=m.getNumNeighbors(x,y);
				System.out.print(retval);
			}
			System.out.println();
		}
	}

}
