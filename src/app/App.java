package app;

public class App {
    public static void main(String[] args) throws Exception {

        Oso.grune();
        Panda.grune();


        Panda p = new Panda();
        p.toDo();

        Oso o = new Oso();
        o.toDo();

        Oso p1 = new Panda();
        p1.toDo();
    }
}