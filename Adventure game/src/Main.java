public class Main {
    public static void main(String[] args) {

        Gold goldbar = new Gold(20);
        Sword magicSword = new Sword();
        Pillow softPillow = new Pillow();
        Mace bigMace = new Mace();

        Ogre greenOgre = new Ogre("Green","20 inch");
        Ogre redOgre = new Ogre("Red","30 inch");
        Zombie slowZombie = new Zombie(15);
        Zombie fastZombie = new Zombie(25);
        Dog spotDog = new Dog("Dog can see in the dark");
        Kaido Emperor = new Kaido("Can turn into Demonic Dragon");
        MoveEast moveEast = new MoveEast();
        MoveWest moveWest = new MoveWest();
        MoveSouth moveSouth = new MoveSouth();
        MoveNorth moveNorth = new MoveNorth();
        Action flee = new Flee();
        Action Jump = new Jump();
        Action viewInventory = new ViewInventory();



        System.out.println(goldbar);
        System.out.println(magicSword);
        System.out.println(softPillow);
        System.out.println(bigMace);
        System.out.println(greenOgre);
        System.out.println(redOgre);
        System.out.println(slowZombie);
        System.out.println(fastZombie);
        System.out.println(spotDog);
        System.out.println(Emperor);
        System.out.println(moveEast.Str());
        System.out.println(moveWest.Str());
        System.out.println(moveSouth.Str());
        System.out.println(moveNorth.Str());
        System.out.println(flee.Str());
        System.out.println(Jump.Str());
        System.out.println(viewInventory.Str());






    }
}
