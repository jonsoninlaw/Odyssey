public class Hangar {

    public static void main(String[] args) {
        
        Car clio = new Car("Renault", 200000);
        Car escort = new Car("Ford", 70000);
        Boat yacht = new Boat("Couach", 20000);
        Boat titanic = new Boat("White Star", 3000);

        System.out.println(clio.doStuff());
        System.out.println(escort.doStuff());
        System.out.println(yacht.doStuff());
        System.out.println(titanic.doStuff());
    }
}