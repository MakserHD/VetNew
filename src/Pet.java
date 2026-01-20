public abstract class Pet implements Treatable {
    protected String name;
    protected int age;
    protected double weight;

    public Pet(String name, int age, double weight) throws InvalidPetDataException {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
    }

    public void setAge(int age) throws InvalidPetDataException {
        if (age < 0 || age > 30) {
            throw new InvalidPetDataException("Age must be between 0 and 30.");
        }
        this.age = age;
    }

    public void setName(String name) throws InvalidPetDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidPetDataException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setWeight(double weight) throws InvalidPetDataException {
        if (weight <= 0) {
            throw new InvalidPetDataException("Weight must be positive.");
        }
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
    }
}