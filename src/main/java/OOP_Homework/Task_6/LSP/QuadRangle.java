package OOP_Homework.Task_6.LSP;

// Принципы SOLID
// L — Liskov Substitution (Принцип подстановки Барбары Лисков)
// В случаях, когда класс-потомок не способен выполнять те же действия,
// что и класс-родитель, возникает риск появления ошибок.

public abstract class QuadRangle {
    public abstract int area();
}
