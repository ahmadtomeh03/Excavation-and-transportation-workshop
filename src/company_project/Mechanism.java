package company_project;
// الاليات 
public class Mechanism {
    private String id;
    private String name;// اسم الالة 
    private Integer price;// سعر الالية 
    private Integer price_of_hour;// سعر الساعة

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice_of_hour() {
        return price_of_hour;
    }

    public void setPrice_of_hour(Integer price_of_hour) {
        this.price_of_hour = price_of_hour;
    }
    
    
}
