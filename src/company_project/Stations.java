/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_project;

/**
 *
 * @author Lenovo
 */

//المحطات
public class Stations {
     String station_name;
     String station_owner_name;
     String phone_number;
     Double money;

    public Stations(String station_name, String station_owner_name, String phone_number, Double money) {
        this.station_name = station_name;
        this.station_owner_name = station_owner_name;
        this.phone_number = phone_number;
        this.money = money;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStation_owner_name() {
        return station_owner_name;
    }

    public void setStation_owner_name(String station_owner_name) {
        this.station_owner_name = station_owner_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
     
     //اضافة رصيد على المحطة
    public void addMoney(Double M){
        this.money+=M;
    }
    
    // تعبئة بنرين من المحطة اذا كانت المصاريالي بالمحطة بتكفي بدفع منهن اذا لا يا بدفع كاش او شيك  
    public void pay(double M){
        if (M<=this.money) this.money-=M;
        else System.out.println("اما بتدفع كاش او شيك");
    }
    
    
     
     
}


