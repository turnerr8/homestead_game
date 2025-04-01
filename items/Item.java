package items;

public class Item {
    public String name;
    public int quantity;

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void addQuantity(int ammount){
        this.quantity += ammount;
    }

    public void subtractQuantity(int ammount){
        this.quantity -= ammount;
    }
    
}
