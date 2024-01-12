
package company_project;
// الصيانة 
public class maintenance {
    private Integer id=0;// 
    private Integer number;// رقم الالية 
    private String date;// تاريخ الصيانة 
    private Integer  amount;// المبلغ 
    private String name_of_Shop;//اسم المحل 
    private String kind_of_maintenance;// نوع الصيانة (صيانة , قطع )

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getName_of_Shop() {
        return name_of_Shop;
    }

    public void setName_of_Shop(String name_of_Shop) {
        this.name_of_Shop = name_of_Shop;
    }

    public String getKind_of_maintenance() {
        return kind_of_maintenance;
    }

    public void setKind_of_maintenance(String kind_of_maintenance) {
        this.kind_of_maintenance = kind_of_maintenance;
    }
    

}
