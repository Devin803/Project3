public class merchandiseItem{

    private String name;
    private double price;
    private final ItemType taxableType;

    public merchandiseItem(String name, double price, ItemType Type) {
        this.name = name;
        this.price = price;
        this.taxableType = Type;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public ItemType getTaxableType(){
        return taxableType;
    }
    public double getTax(){
        if (taxableType == ItemType.Clothing){
            if(price <= 100) {
                return 0;
            }
            else{
                double diff = price - 100;
                return diff * .0625;
            }
        }
        else if(taxableType == ItemType.WICFood){
            return 0;
        }
        else if(taxableType == ItemType.GeneralMerchandise){
            return price * 0.625;
        }
        return 0;
    }
    enum ItemType{
        Clothing, WICFood,GeneralMerchandise
    }
}
