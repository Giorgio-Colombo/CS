public class DogDemo {
    public static void main(String[] arg) {
        Dog balto = new Dog();
        balto.name = "Balto";
        balto.age = 8;
        balto.breed = "Siberian Husky";
        balto.writeOutput();

        Dog scooby = new Dog();
        scooby.name = "Scooby";
        scooby.age = 1;
        scooby.breed = "Great Dane";
        scooby.writeOutput();
        System.out.println(scooby.name + "is a " + scooby.breed + ".");
        System.out.println("He is " + scooby.age + " years old. Or, ");
        int humanYears = scooby.getAgeInHumanYears();
        System.out.println(humanYears + " in human years.");

    }
}