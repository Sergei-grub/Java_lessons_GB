package OOP_seminars.Seminar_2;

public class Human extends Actor {

    public Human(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Integer getId() {
        return super.id;
    }
    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {

        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
