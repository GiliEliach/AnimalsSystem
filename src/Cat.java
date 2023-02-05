class Cat extends Animal implements Land  {
    int numberOfLegs=4;
    Cat(int mood) {
        super(true,true,mood);
    }
    @Override
    public void sayHello() {//reaction of cat by its mood
        System.out.println("Meowing");
        if (this.mood == MOOD_HAPPY)
            System.out.println("Purring");
        else
        if (this.mood == MOOD_SCARE)
            System.out.println("Hissing");
    }
    @Override
    public void sayHello(int mood) {//reaction of cat with input of mood
        try {
            if (mood == MOOD_HAPPY)
                System.out.println("Purring");
            else
            if (mood == MOOD_SCARE)
                System.out.println("Hissing");
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
