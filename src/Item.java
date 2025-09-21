import java.net.http.WebSocket;
import java.util.List;

public class Item {
    int id;
    String name;
    int price;
       String category;
    public Item(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {

        return "id: " + id + " coresponds with name: " + name;
    }
}
