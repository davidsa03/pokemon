import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class AllPokemon
{
  protected String name;
  protected int health;
  protected Actions[] actions; //Creates array for each moveset
  //Pokemon constructor
  public AllPokemon(String n, int h)
  {
    name = n;
    health = h;
  }

  public Actions[] readActions(String filename) throws IOException //input filename to read all moves
  {
    Scanner scanner = new Scanner(new File(filename)); //Scan file
    Actions[] a = new Actions[4]; //creates a new array for all moves

    for(int i = 0; i < 4; i++) //Makes sure there is data available
    {
      String[] data = scanner.nextLine().split(","); //splits the array with ","
      a[i] = new Actions(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3])); //puts all the new array that is split into one move
    }
    return a; //returns set of moves for each pokemon
  }

  public void setActions(Actions[] a) {
    actions = a;
  }

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of health
	* @return
	*/
	public int getHealth() {
		return health;
	}

	/**
	* Sets new value of health
	* @param
	*/
	public void setHealth(int health) {
		this.health = health;
	}

  public void subtractHealth(int amount) {
    this.health -= amount;
  }

}
