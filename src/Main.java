private static final ArrayList<Pet> pets = new ArrayList<>();
private static final Scanner scanner = new Scanner(System.in);

void main() {
    boolean running = true;

    while (running) {
        IO.println("\n=== VET CLINIC (ASSIGNMENT 3) ===");
        IO.println("1. Add Dog");
        IO.println("2. Add Cat");
        IO.println("3. Treat All Pets (Interface Demo)");
        IO.println("0. Exit");
        IO.print("Choice: ");

        String input = scanner.nextLine();
        int choice;

        try {
            choice = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            IO.println("Invalid input! Please enter a number.");
            continue;
        }

        switch (choice) {
            case 1:
                addDog();
                break;
            case 2:
                addCat();
                break;
            case 3:
                treatAll();
                break;
            case 0:
                running = false;
                break;
            default:
                IO.println("Invalid option.");
        }
    }
}

private static void addDog() {
    try {
        IO.print("Name: ");
        String name = scanner.nextLine();

        IO.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        IO.print("Weight: ");
        double weight = Double.parseDouble(scanner.nextLine());

        IO.print("Breed: ");
        String breed = scanner.nextLine();

        Dog d = new Dog(name, age, weight, breed);
        pets.add(d);
        IO.println("Success! Dog added.");

    } catch (InvalidPetDataException e) {
        IO.println("ERROR: " + e.getMessage());
    } catch (NumberFormatException e) {
        IO.println("ERROR: Please enter valid numbers for age/weight.");
    }
}

private static void addCat() {
    try {
        IO.print("Name: ");
        String name = scanner.nextLine();
        IO.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        IO.print("Weight: ");
        double weight = Double.parseDouble(scanner.nextLine());

        Cat c = new Cat(name, age, weight, true);
        pets.add(c);
        IO.println("Success! Cat added.");

    } catch (InvalidPetDataException | NumberFormatException e) {
        IO.println("Error adding cat: " + e.getMessage());
    }
}

private static void treatAll() {
    IO.println("\n--- TREATMENT PROCESS ---");
    for (Pet p : pets) {
        IO.println(p.toString());
        p.performTreatment();
        IO.println("Cost: $" + p.getTreatmentCost());
        IO.println("-----------------");
    }
}