public class ForestAndHouse {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();
        dog.sleep();
        dog.eat();
        dog.makesound();
        TamedAnimal puppy = new Dog();
        puppy.play();
        Dog mydog = new Dog();
        mydog.swingthetail();
        mydog.eat("buiscuits");
        mydog.eat("milk","meat");
        cat.makesound();
        tiger.makesound();
    }
}