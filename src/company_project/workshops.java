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

// الورشات
public class workshops {
  String workshop_name;
  String workshop_owner_name,phone_number;
  String workshop_type;
  String payment_type;
  double total_payment=0;// حسب كل طريقة دفع بنحسب المبلغ الكلي الي حادفعه
  int total_hours,unpaid_hours=0,paid_hours=0;
  double hour_cost;
  double cup_cost;
  int total_cups;
  double paid_check,paid_cash,remain_cost,piad_cost;//المدفوع شيك او كاش  المبلغ المتبقي
  double cc; // نفسه المبلغ المتبقي بس هون مشان نعمل تعديلات عليه عند الدقع او الزيادة اما المبلغ الكلي انا بدي احافظ عليه دون نقصان مشان اعرض الملبغ الكلي الي رح ندفعه 

    public workshops(String workshop_name, String workshop_owner_name, String phone_number, String workshop_type,String payment_type) {
        this.workshop_name = workshop_name;
        this.workshop_owner_name = workshop_owner_name;
        this.phone_number = phone_number;
        this.workshop_type = workshop_type;
        this.payment_type=payment_type;
        
    }

    public String getWorkshop_name() {
        return workshop_name;
    }

    public void setWorkshop_name(String workshop_name) {
        this.workshop_name = workshop_name;
    }

    public String getWorkshop_owner_name() {
        return workshop_owner_name;
    }

    public void setWorkshop_owner_name(String workshop_owner_name) {
        this.workshop_owner_name = workshop_owner_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getWorkshop_type() {
        return workshop_type;
    }

    public void setWorkshop_type(String workshop_type) {
        this.workshop_type = workshop_type;
    }
    
    //حساب المبلغ الكلي لكل طريقة دفع 
    public void total_paymentt(String payment_type , double cost , int number){
        if(this.payment_type=="ساعات"){this.total_payment=cost;
          this.total_hours=number;
          this.hour_cost=cost;
          this.cc=this.total_payment;
        }
        if(this.payment_type=="أكواب"){
          this.total_payment=cost;
          this.total_cups=number;
          this.cup_cost=cost;  
        }
        else this.total_payment=cost;
    }
    
    
    // اضافة ساعات وزيادة المبلغ الكلي ومنه بزيد المبلغ المتبقي وبزيد عدد الساعات الكلي والساعات العير مدفوعة
     public void add_hours(int hours){
        this.total_payment+=(this.hour_cost*hours);
        cc+=(this.hour_cost*hours);
        this.remain_cost+=(this.hour_cost*hours);
        this.unpaid_hours+=hours;
        this.total_hours+=hours;
        
    }
    
    //التعديل على سعر جميع الساعات المدفوعة وغير المدقوعة
    public void update_on_total_hours(int cost){
        
    }
    
    
    //التعديل على سعر  الساعات غير المدفوعة
    //بزيد المبلغ الكلي وبزيد المبلغ المتبقي بنفس المقدار وبغير سعر الساعة عشان لما بدي أدفع يكون السعر متغير عندي وبضربه بعدد الساعات
    public void update_on_hours(int cost){
        this.total_payment+=(this.unpaid_hours)*cost-this.hour_cost;
        cc+=(this.unpaid_hours)*cost-this.hour_cost;
        this.hour_cost=cost;
    }
    
    //الدفع ساعات
    public void paid_hours(int hours_num){
         this.cc-=(hours_num)*this.hour_cost;
         this.paid_hours=hours_num;
         this.remain_cost=cc;
         this.paid_hours+=hours_num;
    }
  
    // الدفع اكواب
    public void paid_cups(int cups_num){
         this.cc-=(cups_num)*this.cup_cost;
          this.remain_cost=cc;
    }
    
    // الدفع مقاولة
    public void paid(int totalcost){
         this.cc-=totalcost;
         this.remain_cost=cc;
    }
    
  
  
}
