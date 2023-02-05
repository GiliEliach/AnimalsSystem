class Frog extends Animal implements Water,Land
{
    int numberOfLegs = 4;

    Frog(int mood) {
        super(false, false, mood);
    }
    //if we don't have the mood,initialize with 0
    Frog() {
        super(false, false, 0);
    }

    @Override

    public void sayHello(int mood) {
        try {
            if (mood == MOOD_HAPPY)
                System.out.println("Singing 'quack quack quack'");
            else if (mood == MOOD_SCARE)
                System.out.println("Plopping into water");
            else
                throw new InvalidInputException("Invalid input. mood must be equal to " + MOOD_HAPPY + " for happy mood or " + MOOD_SCARE + " for scared mood");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
    //getters
    public boolean hasGills() {
        return false;
    }

    public boolean hasLaysEggs() {
        return true;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
}
