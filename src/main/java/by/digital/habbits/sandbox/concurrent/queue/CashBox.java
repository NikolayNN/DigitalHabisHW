package by.digital.habbits.sandbox.concurrent.queue;

public class CashBox {

    private static int generator = 1;
    private final int id;

    public CashBox() {
        this.id = generator++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CashBox{" +
                "id=" + id +
                '}';
    }
}
