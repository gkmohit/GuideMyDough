package Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by AirUnknown on 16-02-06.
 */
public class Person {

    private String mName;
    private String mCardNumber;
    private String mPassword;

    private HashMap<String, ArrayList<String>> mCategoryMap;


    public Person(String name, String cardNumber, String password) {
        mName = name;
        mCardNumber = cardNumber;
        mPassword = password;
    }

}
