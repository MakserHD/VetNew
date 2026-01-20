public class Dog extends Pet {
    private final String breed;

    public Dog(String name, int age, double weight, String breed) throws InvalidPetDataException {
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    public void performTreatment() {
        System.out.println("Giving a bone to " + name + " and checking teeth.");
    }

    @Override
    public double getTreatmentCost() {
        return 50.0 + (weight * 2);
    }

    @Override
    public String toString() {
        return "[Dog] " + super.toString() + ", Breed: " + breed;
    }
}