public class Pet2
{
    private int age;
    private String name;
    private double weight;

    public Pet2(String initialName, int initialAge, double initialWeight)
        {
            set(initialName, initialAge, initialWeight);
            
        }
    public Pet2(String initialName)
        {
            set(initialName, 0, 0);
        }
    public Pet2(int initialAge)
    {
        set("Not name yet.", initialAge, 0);
    }
    public Pet2(double initialWeight)
    {
        set("Not name yet.", 0, initialWeight);
    }
    public Pet2()
    {
        set("Not name yet.", 0, 0);
    }
    public void setPet(String newName, int newAge, double newWeight)
    {
        set(newName, newAge, newWeight);
    }
    public void setName(String newName)
    {
        set(newName, age, weight);
    }
    public void setAge(int newAge)
    {
        set(name, newAge, weight);
    }
    public void setWeight(double newWeight)
    {
        set(name, age, newWeight);
    }
    private void set(String newName, int newAge, double newWeight)
    {
        name = newName;
        if ((newAge < 0) || (newWeight < 0))
        {
            System.out.println("Error: negative Age or negative Weight. ");
            System.exit(0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
        }
    }
}