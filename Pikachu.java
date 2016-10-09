import java.io.IOException;

//Pikachu constructor
public class Pikachu extends AllPokemon //inherits pokemon properties
{
  public Pikachu() throws IOException
  {
    super("Pikachu", 274); //name and health
    setActions(readActions("assets/pikMove.txt"));
  }
}
