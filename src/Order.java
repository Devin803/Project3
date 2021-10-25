import java.util.ArrayList;

public class Order {

  private ShippingAddress destination;
  private Customer orderedBy;
  private ArrayList<merchandiseItem> cartForOrder;

  public Order(ShippingAddress dest, Customer cust)
  {
    destination = dest;
    orderedBy = cust;
    cartForOrder = new ArrayList<merchandiseItem>();
  }

  public String getDestination()
  {
    return destination.toString();
  }
  public String getOrderer()
  {
    return orderedBy.toString();
  }
  public ArrayList<merchandiseItem> getCartForOrder(){
    return cartForOrder;
  }

}
