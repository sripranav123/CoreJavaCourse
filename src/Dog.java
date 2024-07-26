public class Dog extends TamedAnimal{

    @Override
    public void play() {
        System.out.println("Playing Games.");
    }

    @Override
    public void makesound() {
        System.out.println("Barking");
    }
    public void swingthetail(){
        System.out.println("Swinging the Tail");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Sleeps Inside The House.");
    }

    public void eat(String drink,String food) {
        this.eat(food);
        System.out.println("Drinking "+drink);
    }

    public void eat(String food) {
        System.out.println("My Dog Is Eating" + food);
    }
}

