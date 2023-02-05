class Dog extends Animal implements Land  {
    int numberOfLegs=4;
    Dog(int mood) {
        super(true,true,mood);
    }
    @Override
    public void sayHello() {//reaction of dog by its mood
        System.out.println("Wagging tail");
        if (this.mood == MOOD_HAPPY)
            System.out.println("Barking loudly");
        else
        if (this.mood == MOOD_SCARE)
            System.out.println("Whooping");
    }

    public void sayHello(int mood) {//reaction of dog with input of mood
        try {
            if (mood == MOOD_HAPPY)
                System.out.println("Barking loudly");
            else
            if (mood == MOOD_SCARE)
                System.out.println("Whooping");
            else
                throw new InvalidInputException("Invalid input. mood must be equal to " + MOOD_HAPPY + " for happy mood or " + MOOD_SCARE + " for scared mood");
        }
        catch (InvalidInputException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public int getNumberOfLegs()
    {
        return this.numberOfLegs;
    }

}

