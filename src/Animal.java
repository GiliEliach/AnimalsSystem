abstract class Animal {
    protected boolean mammals;
    protected boolean carnivorous;
    protected int MOOD_HAPPY = 1;
    protected int MOOD_SCARE = 0;
    protected int mood;

    //builder for animal including validation for mood
    protected Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        try {
            if (mood != MOOD_HAPPY && mood != MOOD_SCARE)
                throw new InvalidInputException("Invalid input. mood must be equal to " + MOOD_HAPPY + " for happy mood or " + MOOD_SCARE + " for scared mood");
            this.mood = mood;
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
    //2 ways to say hello-with/without mood
    protected void sayHello() {}
    abstract protected void sayHello(int mood);
    //getters
    protected boolean isMammals()
    {
        return this.mammals;
    }

    protected boolean isCarnivorous()
    {
        return this.carnivorous;
    }
    //setters
    protected void setMammals(boolean mammals)
    {
        this.mammals=mammals;
    }
    protected void setCarnivorous(boolean carnivorous)
    {
        this.carnivorous=carnivorous;
    }
}




