public abstract class WildAnimal implements Animal{
    public abstract void hunt();

    @Override
    public void eat() {
        System.out.println("Eating Hunted Food.");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping In a Forest.");
    }
}
