public abstract class LittleCreature {
     private String name;
     private int age;
     private String characterForm;
     private int times;


    //constructor without params, define the default values for DEFAULT Creatures
    public LittleCreature(){
        this.name = "Unknown";
        this.age = 0;
        this.characterForm = "Unknown";
        this.times = 0;
    }   


    //constructor with params to do SPECIAL Creatures
    public LittleCreature(String name, int age, String characterForm, int times){
        this.name = name;
        this.age = age;
        this.characterForm = characterForm;
        this.times = times;
        
    }

    //abstract method, so every child object has to define its own phrase
    public abstract void phrase();

    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + getCharacterForm() + ")\n" +
               "Name: " + getName() + "\n" +
               "Age: " + getAge();
    }

    public void howManyTimes(){
       
        for(int i = 0; i < getTimes(); i++){
            phrase();
        }
    }


    //getting the field values
    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    String getCharacterForm(){
        return characterForm;
    }

    int getTimes(){
        return times;
    }

}
