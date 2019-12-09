import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        Collections.sort(heroes);

        System.out.println("\nOrder by name:");
        showList(heroes);

        Comparator<Hero> comparator = new Comparator<Hero>() {

            @Override
            public int compare(Hero hero1, Hero hero2) {
                return hero2.getAge() - hero1.getAge();
            }
        };

        Collections.sort(heroes, comparator);

        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}