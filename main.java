Fooditem: 
package OnlineFoodDeliSys; 
 
public class FoodItem { 
    private int Id; 
    private String name; 
    private double price; 
 
    public FoodItem(int Id, String name, double price) { 
        this.Id = Id; 
        this.name = name; 
        this.price = price; 
    } 
 
    public int getId() { 
        return Id; 
    } 
 
    public void setId(int Id) { 
        this.Id = Id; 
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public void setName(String name) { 
        this.name = name; 
    } 
 
    public double getPrice() { 
        return price; 
    } 
 
    public void setPrice(double price) { 
        this.price = price; 
    } 
 
    @Override 
    public String toString() { 
        return "FoodItem{" + 
                "Id=" + Id + 
                ", name='" + name + '\'' + 
                ", price=" + price + 
                '}'; 
    } 
} 
 
User: 
package OnlineFoodDeliSys; 
public class User { 
    private int userId; 
    private String username; 
    private long contactNo; 
 
    public User(int userId, String username, long contactNo) { 
this.userId = userId; 
this.username = username; 
this.contactNo = contactNo; 
} 
public int getUserId() { 
return userId; 
} 
public String getUsername() { 
return username; 
} 
public long getContactNo() { 
return contactNo; 
} 
@Override 
public String toString() { 
return "User{" + 
"userId=" + userId + 
", username='" + username + '\'' + 
", contactNo=" + contactNo + 
'}'; 
} 
} 
Cart: 
package OnlineFoodDeliSys; 
import java.util.HashMap; 
import java.util.Map; 
public class Cart { 
private Map<FoodItem, Integer> items; 
public Cart() { 
items = new HashMap<>(); 
} 
public void addItem(FoodItem foodItem, int quantity) { 
items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity); 
} 
 
    public void removeItem(FoodItem foodItem) { 
        items.remove(foodItem); 
    } 
 
    public Map<FoodItem, Integer> getItems() { 
        return items; 
    } 
 
    @Override 
    public String toString() { 
        return "Cart{" + 
                "items=" + items + 
                '}'; 
    } 
} 
 
Customer: 
package OnlineFoodDeliSys; 
 
public class Customer extends User { 
    private Cart cart; 
 
    public Customer(int userId, String username, long contactNo) { 
        super(userId, username, contactNo); 
        this.cart = new Cart(); 
    } 
 
    public Cart getCart() { 
        return cart; 
    } 
} 
 
 
Order: 
package OnlineFoodDeliSys; 
 
import java.util.HashMap; 
import java.util.Map; 
 
public class Order { 
    private int orderId; 
    private Customer customer; 
    private Map<FoodItem, Integer> items; 
    private String status; 
    private DeliveryPerson deliveryPerson; 
    private String deliveryAddress; 
 
    public Order(int orderId, Customer customer) { 
        this.orderId = orderId; 
        this.customer = customer; 
        this.items = new HashMap<>(); 
        this.status = "Pending"; 
    } 
 
    public int getOrderId() { 
        return orderId; 
    } 
 
    public Customer getCustomer() { 
        return customer; 
    } 
 
    public Map<FoodItem, Integer> getItems() { 
        return items; 
    } 
 
    public String getStatus() { 
        return status; 
    } 
 
    public void setStatus(String status) { 
        this.status = status; 
    } 
 
    public DeliveryPerson getDeliveryPerson() { 
        return deliveryPerson; 
    } 
 
    public void setDeliveryPerson(DeliveryPerson deliveryPerson) { 
        this.deliveryPerson = deliveryPerson; 
    } 
 
    public String getDeliveryAddress() { 
        return deliveryAddress; 
    } 
 
    public void setDeliveryAddress(String deliveryAddress) { 
        this.deliveryAddress = deliveryAddress; 
    } 
 
    public void addItem(FoodItem foodItem, int quantity) { 
        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity); 
    } 
 
    @Override 
    public String toString() { 
        return "Order{" + 
                "orderId=" + orderId + 
                ", customer=" + customer + 
                ", items=" + items + 
                ", status='" + status + '\'' + 
                ", deliveryPerson=" + deliveryPerson + 
                ", deliveryAddress='" + deliveryAddress + '\'' + 
                '}'; 
    } 
} 
Delivery Person: 
package OnlineFoodDeliSys; 
 
public class DeliveryPerson { 
    private int deliveryPersonId; 
    private String name; 
    private long contactNo; 
 
    public DeliveryPerson(int deliveryPersonId, String name, long contactNo) { 
        this.deliveryPersonId = deliveryPersonId; 
        this.name = name; 
        this.contactNo = contactNo; 
    } 
 
    public int getDeliveryPersonId() { 
        return deliveryPersonId; 
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public long getContactNo() { 
        return contactNo; 
    } 
 
    @Override 
    public String toString() { 
        return "DeliveryPerson{" + 
                "deliveryPersonId=" + deliveryPersonId + 
                ", name='" + name + '\'' + 
                ", contactNo=" + contactNo + 
                '}'; 
    } 
} 
 
Restaurant: 
package OnlineFoodDeliSys; 
 
import java.util.ArrayList; 
import java.util.List; 
 
public class Restaurant { 
    private int Id; 
    private String name; 
    private List<FoodItem> menu; 
 
    public Restaurant(int id, String name) { 
        this.Id = id; 
        this.name = name; 
        this.menu = new ArrayList<>(); 
    } 
 
    public int getId() { 
        return Id; 
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public List<FoodItem> getMenu() { 
        return menu; 
    } 
 
    public void addFoodItem(FoodItem foodItem) { 
        menu.add(foodItem); 
    } 
 
    public void removeFoodItem(int index) { 
        if (index >= 0 && index < menu.size()) { 
            menu.remove(index); 
        } 
    } 
 
    @Override 
    public String toString() { 
        return "Restaurant{" + 
                "Id=" + Id + 
                ", name='" + name + '\'' + 
                ", menu=" + menu + 
                '}'; 
    } 
} 
Customer Service: 
package OnlineFoodDeliSys; 
 
import java.util.ArrayList; 
import java.util.List; 
 
public class CustomerService { 
    private List<Customer> customers; 
 
    public CustomerService() { 
        customers = new ArrayList<>(); 
    } 
 
    public void addCustomer(Customer customer) { 
        customers.add(customer); 
    } 
 
    public void removeCustomer(int userId) { 
        customers.removeIf(customer -> customer.getUserId() == userId); 
    } 
 
    public Customer getCustomer(int userId) { 
        for (Customer customer : customers) { 
            if (customer.getUserId() == userId) { 
                return customer; 
            } 
        } 
        return null; 
    } 
 
    public List<Customer> getAllCustomers() { 
        return customers; 
    } 
 
    public void placeOrder(Customer customer, Order order) { 
        customer.getCart().getItems().forEach(order::addItem); 
        customer.getCart().getItems().clear(); 
    } 
} 
Order Service: 
package OnlineFoodDeliSys; 
 
import java.util.ArrayList; 
import java.util.List; 
 
public class OrderService { 
    private List<Order> orders; 
 
    public OrderService() { 
        orders = new ArrayList<>(); 
    } 
 
    public void placeOrder(Order order) { 
        orders.add(order); 
    } 
 
    public void cancelOrder(int orderId) { 
        orders.removeIf(order -> order.getOrderId() == orderId); 
    } 
 
    public Order getOrder(int orderId) { 
        for (Order order : orders) { 
            if (order.getOrderId() == orderId) { 
                return order; 
            } 
        } 
        return null; 
    } 
 
    public List<Order> getAllOrders() { 
        return orders; 
    } 
 
    public List<Order> getOrdersByCustomer(int customerId) { 
        List<Order> customerOrders = new ArrayList<>(); 
        for (Order order : orders) { 
            if (order.getCustomer().getUserId() == customerId) { 
                customerOrders.add(order); 
            } 
        } 
        return customerOrders; 
    } 
} 
Food Service: 
package OnlineFoodDeliSys; 
 
import java.util.ArrayList; 
import java.util.List; 
 
public class FoodService { 
    private List<Restaurant> restaurants; 
 
    public FoodService() { 
        restaurants = new ArrayList<>(); 
    } 
 
    public void addRestaurant(Restaurant restaurant) { 
        restaurants.add(restaurant); 
    } 
 
    public void removeRestaurant(int id) { 
        restaurants.removeIf(restaurant -> restaurant.getId() == id); 
    } 
 
    public Restaurant getRestaurant(int id) { 
        for (Restaurant restaurant : restaurants) { 
            if (restaurant.getId() == id) { 
                return restaurant; 
            } 
        } 
        return null; 
    } 
 
    public List<Restaurant> getAllRestaurants() { 
        return restaurants; 
    } 
 
    public void addFoodItemToRestaurant(int restaurantId, FoodItem foodItem) { 
        Restaurant restaurant = getRestaurant(restaurantId); 
        if (restaurant != null) { 
            restaurant.addFoodItem(foodItem); 
        } 
    } 
 
    public void removeFoodItemFromRestaurant(int restaurantId, int index) { 
        Restaurant restaurant = getRestaurant(restaurantId); 
        if (restaurant != null) { 
            restaurant.removeFoodItem(index); 
        } 
    } 
} 
Main Program: 
package OnlineFoodDeliSys; 
 
import java.util.List; 
 
public class OnlineFoodDeliverySystem { 
    public static void main(String[] args) { 
        CustomerService customerService = new CustomerService(); 
        FoodService foodService = new FoodService(); 
        OrderService orderService = new OrderService(); 
 
        FoodItem pizza = new FoodItem(1, "Pizza", 8.99); 
        FoodItem burger = new FoodItem(2, "Burger", 5.49); 
 
        Restaurant restaurant = new Restaurant(1, "Fast Food Place"); 
        foodService.addRestaurant(restaurant); 
        foodService.addFoodItemToRestaurant(1, pizza); 
        foodService.addFoodItemToRestaurant(1, burger); 
 
        Customer customer = new Customer(1, "John Doe", 1234567890); 
customerService.addCustomer(customer); 
customer.getCart().addItem(pizza, 2); 
customer.getCart().addItem(burger, 1); 
Order order = new Order(1, customer); 
orderService.placeOrder(order); 
customerService.placeOrder(customer, order); 
System.out.println(order); 
List<Restaurant> allRestaurants = foodService.getAllRestaurants(); 
System.out.println("Available Restaurants: " + allRestaurants); 
List<Order> customerOrders = 
orderService.getOrdersByCustomer(customer.getUserId()); 
System.out.println("Customer Orders: " + customerOrders); 
} 
} 
