public class Hamster extends Pet {
    public Hamster() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Пи-пи!");
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
}