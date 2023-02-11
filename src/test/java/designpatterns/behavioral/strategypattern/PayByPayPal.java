package designpatterns.behavioral.strategypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PaymentStrategy{
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean isSingedIn;

    static {
        DATA_BASE.put("john1234", "johndoe@gmail.com");
        DATA_BASE.put("jane1234", "janedoe@yahoo.com");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (isSingedIn) {
            System.out.println("Paying "+paymentAmount+ " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try{
            while (!isSingedIn){
                System.out.println("Enter email address");
                email = READER.readLine();
                System.out.println("Enter password");
                password = READER.readLine();

                if (verify()){
                    System.out.println("Verification successful.");
                } else{
                    System.out.println("Wrong email or password!");
                }
            }

        } catch (IOException ex){
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private boolean verify(){
        setSingedIn(email.equals(DATA_BASE.get(password)));
        return isSingedIn;
    }

    private void setSingedIn(boolean singedIn){
        this.isSingedIn = singedIn;
    }
}
