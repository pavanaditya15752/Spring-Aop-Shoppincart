package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    //Authentication and Authorization
    //Logging
    //Sanitize the data
    public void checkout(String status){
        System.out.println("checkout method from shopping card called:"+status);
    }
    public int quantity(){
        return 2;
    }
}
