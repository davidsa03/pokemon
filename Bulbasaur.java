import java.io.IOException;
//Bulbasaur constructor
public class Bulbasaur extends AllPokemon //inherits pokemon properties
{
  public Bulbasaur() throws IOException
  {
    super("Bulbasaur", 294); //name and health
    setActions(readActions("assets/bulbMove.txt"));
  }
}
