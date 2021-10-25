public class merchandiseItem{

    private String name;
    private double price;
    private ItemType taxibleType;

    public merchandiseItem(String name, double price, ItemType taxibleType) {
        this.name = name;
        this.price = price;
        this.taxibleType = taxibleType;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public ItemType getTaxibleType(){
        return taxibleType;
    }
}
