import java.io.IOException;
//Squirtle constructor
public class Squirtle extends AllPokemon //inherits pokemon properties
{
  public Squirtle() throws IOException
  {
    super("Squirtle", 292); //name and health
    setActions(readActions("assets/squirtMove.txt"));
  }
}
