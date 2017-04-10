import java.util.*;

class PirateCounter{

  static class Pirate {
    String name;
    boolean hasWoodenLeg;
    int gold;

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }

    public int filter() {
      if(this.hasWoodenLeg == true && this.gold > 15) {
        return 1;
      }
      return 0;
    }

    public String getName() {
      return this.name;
    }
  }

  public static List<String> isRichOrHasWoodenLeg(List<Pirate> pirates) {
    List<String> names = new ArrayList<>();
    for (Pirate p : pirates) {
      if(p.filter() == 1) {
        names.add(p.getName());
      }
    }
    return names;
  }

  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    System.out.println(isRichOrHasWoodenLeg(pirates));
  }
}