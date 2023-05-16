package OOPHomeWork;

public class TestAnimal {
    public static void main(String[] args) {
        Cat Masha = new Cat("Persian","Female",1.6f
                ,777,(byte) 3,"purple","Sofia",true);

        Masha.Meow();
        Masha.licking();
        Masha.Scratch();

        Dog Rasho = new Dog("Dogo Argentino","Male",15.5f,888,(byte) 10,"black"
        ,"Buenos Aires",false);
        Rasho.licking();


    }

}
