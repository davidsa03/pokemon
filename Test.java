import java.io.IOException;

public class Test {
  public static void main(String[] args) throws IOException {
    Charmander c = new Charmander();
    Bulbasaur b = new Bulbasaur();
    Magikarp m = new Magikarp();
    Pikachu p = new Pikachu();
    Squirtle s = new Squirtle();
    Pidgey pi = new Pidgey();

    System.out.println(c.getName());
    for(int i = 0; i < c.actions.length; i++) {
      System.out.println(c.actions[i].toString());
    }
    System.out.println(b.getName());
    for(int i = 0; i < b.actions.length; i++) {
      System.out.println(b.actions[i].toString());
    }
    System.out.println(m.getName());
    for(int i = 0; i < m.actions.length; i++) {
      System.out.println(m.actions[i].toString());
    }
    System.out.println(p.getName());
    for(int i = 0; i < p.actions.length; i++) {
      System.out.println(p.actions[i].toString());
    }
    System.out.println(s.getName());
    for(int i = 0; i < s.actions.length; i++) {
      System.out.println(s.actions[i].toString());
    }
    System.out.println(pi.getName());
    for(int i = 0; i < pi.actions.length; i++) {
      System.out.println(pi.actions[i].toString());
    }



  }
}
