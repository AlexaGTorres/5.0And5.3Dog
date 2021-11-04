public class DogDriver
{
    public static void main (String [] args)
    {
        Dog dog1 = new Dog ("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog ("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog ("Bambi", 8, "Boxer Husky", 80);

        System.out.println (dog1.getBreed() + ", " + dog1.getAge() + " years old.");
        System.out.println (dog2.getWeight() + " pounds.");
        System.out.println (dog3.toString());
        System.out.println (Dog.getCount() + " dogs.");

        System.out.println ("\nPounds to Kilo: " + dog2.getWeight() + " pounds to " + dog2.poundToKilo());//Test brain method
        System.out.println ("");

        //Fang and Piper
        if (dog2.compareTo(dog1) == 0)
        {
            System.out.println (dog2.getName() + " is the same age as " + dog1.getName());
        }
        else if (dog2.compareTo(dog1) > 0)
        {
            System.out.println (dog2.getName() + " is older than " + dog1.getName());
        }
        else
        {
            System.out.println (dog2.getName() + " is younger than " + dog1.getName());
        }

        //Fang to my dog
        if (dog1.compareTo(dog3) == 0)
        {
            System.out.println (dog1.getName() + " is the same age as " + dog3.getName());
        }
        else if (dog1.compareTo(dog3) > 0)
        {
            System.out.println (dog1.getName() + " is older than " + dog3.getName());
        }
        else
        {
            System.out.println (dog1.getName() + " is younger than " + dog3.getName());
        }
    }//End main method
}//End class DogDriver
