public class Cat extends Animal {
    public static int countCat;
    public Cat(String nickname, int run, int swim) {
        super(nickname, run, swim);
        countCat++;
    }

    @Override
    public void animalSwim() {
        if (swim > 0)
            System.out.println(nickname + " не умеет плавать");
    }

    @Override
    public void animalRun() {
        if (run <= 200)
        { System.out.println(nickname + " пробежал(a) " + run + " м");
        } else
            System.out.println(nickname + " не может пробежать " + run + " м"); }

}
