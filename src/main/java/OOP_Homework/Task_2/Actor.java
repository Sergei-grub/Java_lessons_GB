package OOP_Homework.Task_2;

public abstract class Actor implements ActorBehaviour {

    protected int id = 1; // Добавлено поле id покупателя

    protected final String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getName();

    public abstract Integer getId();
}
