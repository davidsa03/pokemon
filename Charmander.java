//Charmander constructor
import java.util.Scanner;
import java.io.*;

public class Charmander extends AllPokemon //inherits pokemon properties
{
  public Charmander() throws IOException
  {
    super("Charmander", 282); //name and health
    setActions(readActions("assets/charMove.txt")); //adds moves
  }
}
