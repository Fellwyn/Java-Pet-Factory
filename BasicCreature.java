public class BasicCreature extends LittleCreature {
    
    public BasicCreature() {
        super("Unknown", 0, "-", 1);
    }

    @Override
    //overriding parent's method
    public void phrase() {
        System.out.println("The basic creature makes noise.");


    }

    @Override 
    //here we convert the object into better format to read.
    //  If user has not provided any details to the input, this will print the basic creature details
    public String toString(){
        return getClass().getSimpleName() + getCharacterForm() + " " + "\nName: " + getName() + " " + "Age: " + getAge()  + " " ;
    }




}
