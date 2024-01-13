package company_project;
public class Employee {
    String name;// الاسم 
    String numberofcard;// رقم الهوية
    Integer salary;//المبلغ 
    String numberofphone;// رقم الهوية  
    public String getName() {
        return name;
    }
    public String getNumberofcard() {
        return numberofcard;
    }
    public Integer getSalary() {
        return salary;
    }
    public String getNumberofphone() {
        return numberofphone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumberofcard(String numberofcard) {
        this.numberofcard = numberofcard;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public void setNumberofphone(String numberofphone) {
        this.numberofphone = numberofphone;
    }
}