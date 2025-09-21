import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item(1, "Laptop", 10000, "Electronics");
        Item item2 = new Item(2, "Smartphone", 5000, "Electronics");
        Item item3 = new Item(3, "Book", 1500, "Books");
        Item item4 = new  Item(4, "Pen", 200, "Books");
        Item item5 = new Item(5, "Pen", 200, "Books");
        Item item6 = new Item(6, "Pen", 200, "Books");
        Item item7 = new Item(7, "Pen", 200, "Books");
        Item item8 = new Item(8, "Pen", 200, "Books");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        System.out.println(items);
        System.out.println(item1.price);
        Item mostExpensive = items.stream()
                .max(Comparator.comparingDouble(Item->Item.price))
        .orElse(null);
        System.out.println("Most Expensive Item has "+ mostExpensive);
        int removeId =3;
        items.removeIf(item -> item.id == removeId);
        System.out.println("After removing item with id "+ removeId + " the list is: " + items );
    }



    }
