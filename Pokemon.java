/* David Sa
 * Pokemon.java
 * DSa100 */
import java.util.*;
import java.io.*;

public class Pokemon
{
  private static String name;
  private static String[] pokeChoice;
  public static void main(String[] args) throws IOException
  {
    startup();
    if(startBattle(pokeChoice)) {
        System.out.println("You win!");
    } else {
      System.out.println("You lost!");
    }
  }
/**********Startup method**********/
  public static void startup() throws IOException
  {
    System.out.println("                                  ,'\\");
    System.out.println("    _.----.        ____         ,'  _\\   ___    ___     ____");
    System.out.println("_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.");
    System.out.println("\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |");
    System.out.println(" \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |");
    System.out.println("   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |");
    System.out.println("    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |");
    System.out.println("     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |");
    System.out.println("      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |");
    System.out.println("       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |");
    System.out.println("        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |");
    System.out.println("                                `'                            '-._|");
    System.out.println("                              TYPE START");
    String start;
    Scanner reader = new Scanner(System.in);
    start = reader.nextLine();
    if(start.equalsIgnoreCase("start")) //User will type start and take them to a menu
    {
      menu();
    }
    else
    {
      startup();
    }
  }
/**********Menu method**********/
  public static void menu() throws IOException
  {
    Scanner reader = new Scanner(System.in);
    //Professor Oak's dialogue from Bulbapedia
    System.out.println("Hello there! Welcome to the world of Pokémon!" +
                       " My name is Oak! People call me the Pokémon Prof! " +
                       "This world is inhabited by creatures called Pokémon! " +
                       "For some people, Pokémon are pets. Other use them for fights. " +
                       "Myself… I study Pokémon as a profession. First, what is your name? ");
    name = reader.nextLine();
    PokemonClass poke = new PokemonClass(name); //calls the pokemonclass
    System.out.println("Right! So your name is " + poke.getName() + "!"); //getname to print the name
    System.out.println("Now, " + poke.getName() + " which Pokémon do you want?");
    System.out.println("(Select 3 pokemon using the numberpad)");
    System.out.println("1. Charmander");
    System.out.println("2. Squirtle");
    System.out.println("3. Bulbasaur");
    System.out.println("4. Pikachu");
    System.out.println("5. Magikarp");
    System.out.println("6. Pidgey");
    //Menu choice method is used here to choose pokemon
    pokeChoice = menuChoice(); //The 3 pokemon
    System.out.println("Your 3 starting pokemon are:\n"
                         + pokeChoice[0] + "\n" + pokeChoice[1] + "\n" + pokeChoice[2]);
  }
/**********NewPoke method**********/
  public static AllPokemon newPoke(String[] pokemon) throws IOException//Method for matching up selection with constructor class
  {
    //Initialize the new constructors
    Charmander charmander = new Charmander();
//    Squirtle squirtle = new Squirtle();
//    Bulbasaur bulbasaur = new Bulbasaur();
//    Pikachu pikachu = new Pikachu();
//    Magikarp magikarp = new Magikarp();
//    Pidgey pidgey = new Pidgey();
    if(pokemon[0].equals("Charmander")) //will set pokemon1 to charmander if it equals it
    {
      return charmander;
    }
//    else if(pokemon[0].equals("Squirtle"))
//    {
//      return squirtle;
//    }
//    else if(pokemon[0].equals("Bulbasaur"))
//    {
//      return bulbasaur;
//    }
//    else if(pokemon[0].equals("Pikachu"))
//    {
//      return pikachu;
//    }
//    else if(pokemon[0].equals("Magikarp"))
//    {
//      return magikarp;
//    }
//    else if(pokemon[0].equals("Pidgey"))
//    {
//      return pidgey;
//    }
    else
    {
      return null;
    }
  }
/**********MenuChoice method**********/
  public static String[] menuChoice()
  {
    //Variable for which pokemon is selected
    String choice1 = null;
    String choice2 = null;
    String choice3 = null;
    //The 3 chosen pokemon
    String[] pokemons = new String[3];
    String pokemon1 = null;
    String pokemon2 = null;
    String pokemon3 = null;
    Scanner reader = new Scanner(System.in); //Scanner for choosing which pokemon
    choice1 = reader.nextLine();//The 3 different choices
    choice2 = reader.nextLine();
    choice3 = reader.nextLine();
    //If statment to assign the 3 pokemons
    //First pokemon
    if(choice1.equals("1"))
    {
      pokemons[0] = "Charmander";
    }
    else if(choice1.equals("2"))
    {
      pokemons[0] = "Squirtle";
    }
    else if(choice1.equals("3"))
    {
      pokemons[0] = "Bulbasaur";
    }
    else if(choice1.equals("4"))
    {
      pokemons[0] = "Pikachu";
    }
    else if(choice1.equals("5"))
    {
      pokemons[0] = "Magikarp";
    }
    else if(choice1.equals("6"))
    {
      pokemons[0] = "Pidgey";
    }
    //Second pokemon
    if(choice2.equals("1"))
    {
      pokemons[1] = "Charmander";
    }
    else if(choice2.equals("2"))
    {
      pokemons[1] = "Squirtle";
    }
    else if(choice2.equals("3"))
    {
      pokemons[1] = "Bulbasaur";
    }
    else if(choice2.equals("4"))
    {
      pokemons[1] = "Pikachu";
    }
    else if(choice2.equals("5"))
    {
      pokemons[1] = "Magikarp";
    }
    else if(choice2.equals("6"))
    {
      pokemons[1] = "Pidgey";
    }
    //Third pokemon
    if(choice3.equals("1"))
    {
      pokemons[2] = "Charmander";
    }
    else if(choice3.equals("2"))
    {
      pokemons[2] = "Squirtle";
    }
    else if(choice3.equals("3"))
    {
      pokemons[2] = "Bulbasaur";
    }
    else if(choice3.equals("4"))
    {
      pokemons[2] = "Pikachu";
    }
    else if(choice3.equals("5"))
    {
      pokemons[2] = "Magikarp";
    }
    else if(choice3.equals("6"))
    {
      pokemons[2] = "Pidgey";
    }
    return pokemons;
  }
/**********StartBattle method**********/
  public static boolean startBattle(String[] p) throws IOException
  {
    System.out.println("Ready to battle?");
    String battle; //Yes or no for battle
    Scanner reader = new Scanner(System.in); //Scans user input
    battle = reader.nextLine();
    if(battle.equalsIgnoreCase("yes")) //Ask if user is ready to battle
    {
      Random random = new Random();
      AllPokemon[] list = {new Charmander(), new Squirtle(), new Bulbasaur(), new Pikachu(), new Magikarp(), new Pidgey()};
      int aiChar = random.nextInt(6);
      AllPokemon aiCurrent = list[aiChar];
      System.out.println("Wild " + aiCurrent.getName() + " appeared!"); //start of battle here
      // User select Pokemon
      AllPokemon[] userList = convertStringToPoke(pokeChoice);
      Battle fight = new Battle(userList[0], aiCurrent); //access the battle class
      return fight.startBattle();
    }
    else
    {
      return false;
    }
  }

  public static AllPokemon[] convertStringToPoke(String[] p) throws IOException {
    AllPokemon[] poke = new AllPokemon[p.length];
    for(int i = 0; i < p.length; i++) {
      switch(p[i]) {
        case "Charmander": {
          poke[i] = new Charmander();
          break;
        }
        case "Squirtle": {
          poke[i] = new Squirtle();
          break;
        }
        case "Bulbasaur": {
          poke[i] = new Bulbasaur();
          break;
        }
        case "Pikachu": {
          poke[i] = new Pikachu();
          break;
        }
        case "Magikarp": {
          poke[i] = new Magikarp();
          break;
        }
        case "Pidgey": {
          poke[i] = new Pidgey();
          break;
        }
      }
    }
    return poke;
  }
}
