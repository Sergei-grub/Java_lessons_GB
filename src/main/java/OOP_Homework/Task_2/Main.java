package OOP_Homework.Task_2;


public class Main {
    public static void main(String[] args) {
        int id = 5;
        Market market = new Market();
        Human human1 = new Human(++id,"Ivan");
        Human human2 = new Human(++id,"Sergei");
        Human human3 = new Human(++id,"Anna");
        Human human4 = new Human(++id,"Bob");
        Human human5 = new Human(++id,"Vladimir");
        Human human6 = new Human(++id,"Emil");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.acceptToMarket(human5);
        market.acceptToMarket(human6);
        market.update();
    }
}
