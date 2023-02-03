public class Main {
    public static void main(String[] args) {

        Gold goldbar = new Gold(20);
        Sword magicSword = new Sword();
        Pillow softPillow = new Pillow();
        Mace bigMace = new Mace();

        Enemy greenOgre = new Enemy("greenOgre", 35, 20);
        Enemy redOgre = new Enemy("redOgre", 35, 20);
        Enemy slowZombie = new Enemy("slowZombie", 15, 10);
        Enemy fastZombie = new Enemy("fastZombie", 15, 10);
        Enemy spotDog = new Enemy("spotDog", 20, 10);
        Enemy Emperor = new Enemy("Kaido",75,50);



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




    }
}