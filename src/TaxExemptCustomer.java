import java.util.ArrayList;

public class TaxExemptCustomer extends Customer{

    public double payForOrder(ArrayList<merchandiseItem> itemsInOrder){
        double sum = 0;
        for (int i = 0; i < itemsInOrder.size(); i++){
            merchandiseItem item = itemsInOrder.get(i);
            sum = sum + item.getPrice();
        }
        return sum;
    }
    public void arrangeDelivery(){
        System.out.println("Name: " + getName() + " Delivery will be from Mon-Fri, 10-6");
    }
}
