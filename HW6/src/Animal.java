public abstract class Animal {
    public static int countAnimal;
    protected String nickname;
    protected int run;
    protected int swim;

    public Animal (String nickname, int run, int swim) {
        this.nickname = nickname;
        this.run = run;
        this.swim = swim;
        countAnimal++;
    }

    public abstract void animalRun();

    public abstract void animalSwim();

}


