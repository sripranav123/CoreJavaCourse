public abstract class TamedAnimal implements Animal{
    public abstract void play();

    @Override
    public void eat() {
        System.out.println("Eating Pet Food.");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping In a Owner's Place.");
    }
}