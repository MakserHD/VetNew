public class Cat extends Pet {
    private final boolean hasNiceFur;

    public Cat(String name, int age, double weight, boolean hasNiceFur) throws InvalidPetDataException {
        super(name, age, weight);
        this.hasNiceFur = hasNiceFur;
    }

    @Override
    public void performTreatment() {
        System.out.println("Grooming " + name + " and checking claws.");
    }

    @Override
    public double getTreatmentCost() {
        return 30.0;
    }

    @Override
    public String toString() {
        return "[Cat] " + super.toString() + ", Nice Fur: " + hasNiceFur;
    }
}