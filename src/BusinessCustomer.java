import java.util.ArrayList;

public class BusinessCustomer extends Customer {

    private double purchaseOrderBalance;

    public double PayForOrder(ArrayList<merchandiseItem> itemsInOrder){
    System.out.println("This order will be for this customer and it will be payed with a purchase order");
        double sum = 0 ;
        double tax= 0;
        for(int i = 0;i<itemsInOrder.size();i++){
            merchandiseItem item = itemsInOrder.get(i);
            sum = sum + item.getPrice();
            tax = tax + item.getTax();

        }
        purchaseOrderBalance = sum + tax;
        return 0;

    }

}
