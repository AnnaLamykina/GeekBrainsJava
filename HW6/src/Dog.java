public class Dog extends Animal {
    public static int countDog;
    public Dog(String nickname, int run, int swim) {
        super(nickname, run, swim);
        countDog++;
    }

    @Override
    public void animalSwim() {
        if (swim <= 10)
        {
            System.out.println(nickname + " проплыл(а) " + swim + " м");
        } else
            System.out.println(nickname + " не может проплыть " + swim + " м");
    }

    @Override
    public void animalRun() {
        if (run <= 500) {
            System.out.println(nickname + " пробежал(a) " + run + " м");
        } else
            System.out.println(nickname + " не может пробежать " + run + " м");
    }


}
