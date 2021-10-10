/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author susan
 */
public class Cars {
    
    int price;
    int availability;
    String make;
    int year;
    int seat;
    int serialnumber;
    String model;
    
     private static int count = 0;
    public boolean getCarPrice;
    public boolean getCarMake;
    public boolean getCarYear;
    public boolean getCarSeat;
    public boolean getCarSerialNumber;
    public boolean getCarModel;
    public boolean getCarAvailablity;
    public boolean getCarUpdate;
    public boolean getCarAvailability;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cars.count = count;
    }

    public void setAvailability(String availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
}
