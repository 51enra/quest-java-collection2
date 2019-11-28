import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // Modify Hero to implements Comparable and sort by name (ascending)
        Collections.sort(heroes);

        System.out.println("\nOrder by name:");
        showList(heroes);

        // Add a Comparator and sort by age (descending)
       Comparator<Hero> heroByDescendingAge = new Comparator<Hero>() {
    	   @Override
    	   public int compare(Hero hero1, Hero hero2) {
    		   return Integer.valueOf(hero2.getAge()).compareTo(Integer.valueOf(hero1.getAge()));
    	   }
       };
       
       Collections.sort(heroes, heroByDescendingAge);
       
        System.out.println("\nOrder by age (descending):");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}