package JAVAFX;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.sql.Date;

public class ListTableinstruments_customers {
    public SimpleIntegerProperty Tool_ID = new SimpleIntegerProperty();
    public SimpleIntegerProperty customerID = new SimpleIntegerProperty();
    public SimpleIntegerProperty price = new SimpleIntegerProperty();

// Tool ID
    public int getTool_ID() {
        return Tool_ID.get();
    }

    public SimpleIntegerProperty Tool_IDProperty() {
        return Tool_ID;
    }
// CUSTOMER ID
    public int getcustomerID() {
        return customerID.get();
    }

    public SimpleIntegerProperty customerIDProperty() {
        return customerID;
    }
//PRICE
    public int getprice() {
        return price.get();
    }

    public SimpleIntegerProperty priceProperty() {
        return price;
    }

 
}

