import java.io.IOException;
//Magikarp constructor
public class Magikarp extends AllPokemon //inherits pokemon properties
{
  public Magikarp() throws IOException
  {
    super("Magikarp", 244); //name and health
    setActions(readActions("assets/magiMove.txt"));
  }
}
