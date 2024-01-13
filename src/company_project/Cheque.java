
package company_project;
public class Cheque {

    private Integer number_of_cheque;// رقم الشك  
    private String date; // تاريخ التسليم 
    private String data_spending_the_money;//تاريخ الصرف 
    private Integer value=0;// قيمة الشك
   // يوجد صورة 

    public void setNumber_of_cheque(Integer number_of_cheque) {
        this.number_of_cheque = number_of_cheque;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setData_spending_the_money(String data_spending_the_money) {
        this.data_spending_the_money = data_spending_the_money;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getNumber_of_cheque() {
        return number_of_cheque;
    }

    public String getDate() {
        return date;
    }

    public String getData_spending_the_money() {
        return data_spending_the_money;
    }

    public Integer getValue() {
        return value;
    }
       
}
