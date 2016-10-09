import java.io.IOException;
//Pidgey constructor
public class Pidgey extends AllPokemon //inherits pokemon properties
{
  public Pidgey() throws IOException
  {
    super("Pidgey", 190); //name and health
    setActions(readActions("assets/pidgMove.txt"));
  }
}
