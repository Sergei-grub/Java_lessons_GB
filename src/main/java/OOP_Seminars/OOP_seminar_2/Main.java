package OOP_Seminars.OOP_seminar_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Vladimir");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
