import java.text.DecimalFormat;

public class Dog implements Comparable
{
    //Instance Variables
    private String name;
    private int age;
    private String breed;
    private double weight;
    private static int count;

    //Constructors
    public Dog (String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        count++;
    }//Full constructor

    public Dog ()
    {
        this.name = "Unnamed";
        this.age = 0;
        this.breed = "Unknown";
        this.weight = 0.0;
        count++;
    }//Default constructor

    //Getters
    public static int getCount () {return count;}

    public String getName () {return this.name;}

    public int getAge () {return this.age;}

    public String getBreed () {return this.breed;}

    public double getWeight () {return this.weight;}

    //Setters
    public void setName (String newName) {name = newName;}

    public void setAge (int newAge) {age = newAge;}

    public void setBreed (String newBreed) {breed = newBreed;}

    public void setWeight (double newWeight) {weight = newWeight;}

    //Brain Method
    public String poundToKilo ()
    {
        double output;

        output = weight / 2.20462;
        DecimalFormat df = new DecimalFormat("#.##");

        return df.format(output);
    }//Pounds to kilograms

    //toString
    public String toString ()
    {
        String output = name + " is a " + age + " year old " + breed + " that is " + weight + " pounds.";
        return output;
    }//toString

    @Override
    public int compareTo(Object d)
    {
        int output = 0;

        if(this.age < ((Dog)d).getAge())
        {
            output = -1;
        }
        else if (this.age > ((Dog)d).getAge())
        {
            output = 1;
        }
        return output;
    }

}//End class Dog
