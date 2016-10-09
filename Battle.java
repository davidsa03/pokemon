import java.util.Scanner;
import java.util.Random;

//battling class
public class Battle
{

  private AllPokemon a;
  private AllPokemon b;

  public Battle(AllPokemon one, AllPokemon two) //Battle between user and AI
  {
    a = one; //user
    b = two; //ai
    startBattle(); //Will run startBattle method
  }

  // Main battle code
  private boolean init = false; //variable for first time battling
  private boolean gotAway = false; //variable for the run away

  public boolean startBattle()
  {
    if(a.getHealth() <= 0) //if the health is 0 then you lose
    {
      return false; //lose
    }
    if(b.getHealth() <= 0) //if AI is 0 you when
    {
      return true; //win
    }
    if(gotAway)
    {
      return false;
    }
    if(!init) //first time
    {
      System.out.println("Go " + a.getName() + "!");
      init = true; //sets it so its not first time anymore
    }
    System.out.println("What will " + a.getName() + " do?");
    System.out.println("1. Fight 2. Run");
    Scanner scanner = new Scanner(System.in); //scan for user input, fight or run
    int choice = scanner.nextInt();
    switch(choice) //switch for choices of options
    {
      case 1:
      {
        // Display move options
        System.out.println("Fight!");
        for(int i = 1; i < a.actions.length + 1; i++) //print out all of the possible moves
        {
          System.out.println(i + ". " + a.actions[i - 1]);
        }
        int fightSelection = scanner.nextInt();
        if(fightSelection < 1 || fightSelection > 4) //keeps the selection within boundaries
        {
          System.out.println("INVALID CHOICE");
          startBattle();
        } else
        {
          Actions current = a.actions[fightSelection - 1];
          if(hit(current.getAccuracy())) //if the attack hits
          {
            b.subtractHealth(current.getPower()); //AIHealth - power
            current.subtractPp(1); //-PP
            //Display stats
            System.out.println(a.getName() + " used " + current.getName());
            System.out.println(a.getName() + " Health: " + a.getHealth());
            System.out.println(b.getName() + " Health: " + b.getHealth());
            if(a.getHealth() <= 0)
            {
              return false;
            }
            if(b.getHealth() <= 0)
            {
              return true;
            }
            break;
          } else
          {
            System.out.println(a.getName() + " missed!");
            System.out.println(a.getName() + " Health: " + a.getHealth());
            System.out.println(b.getName() + " Health: " + b.getHealth());
            current.subtractPp(1);
            if(a.getHealth() <= 0)
            {
              return false;
            }
            if(b.getHealth() <= 0)
            {
              return true;
            }
            break;
          }
        }
        break;
      }
      case 2:
      {
        // Run
        if(hit(75))
        {
          // Run away successful
          System.out.println("Got away safely");
          gotAway = true;
          break;
        } else
        {
          System.out.println("Can't escape!");
          gotAway = false;
          break;
        }

      }
      default:
      {
        System.out.println("Please choose a valid choice.");
        startBattle();
      }
    }
    if(a.getHealth() <= 0)
    {
      return false;
    }
    if(b.getHealth() <= 0)
    {
      return true;
    }

    if(!gotAway)
    {
     // AI Turn
      Random random = new Random();
      int move = random.nextInt(4);
      int counter = 0;
      while(b.actions[move].getPp() <= 0 && counter < 50)
      {
        move = random.nextInt(4); //picks a random move
        counter++;
      }
      Actions aiAction = b.actions[move];
      if(hit(aiAction.getAccuracy()))
      {
        a.subtractHealth(aiAction.getPower());
        aiAction.subtractPp(1);
        System.out.println(b.getName() + " used " + aiAction.getName());
        System.out.println(a.getName() + " Health: " + a.getHealth());
        System.out.println(b.getName() + " Health: " + b.getHealth());
        if(a.getHealth() <= 0)
        {
          return false;
        }
        if(b.getHealth() <= 0)
        {
          return true;
        }
      } else
      {
        System.out.println(b.getName() + " missed!");
        System.out.println(a.getName() + " Health: " + a.getHealth());
        System.out.println(b.getName() + " Health: " + b.getHealth());
        aiAction.subtractPp(1);
        if(a.getHealth() <= 0)
        {
          return false;
        }
        if(b.getHealth() <= 0)
        {
          return true;
        }
      }
      startBattle();
      return false;
    }
    return false;
  }

  // Determine if attack hits target
  private boolean hit(int accuracy)
  {
    Random random = new Random();
    int num = random.nextInt(100); //creates random number 0-100
    if(num < accuracy) //if number is lower than the accuracy then you can attack
    {
      return true;
    } else
    {
      return false;
    }
  }


  // public String startBattle()
  // {
  //   String s = "";
  //   return s;
  // }
}
