import java.util.ArrayList;
import java.util.List;

public class Customers extends CinemaTicketSystem1 {
    private static List<Customers> Customers = new ArrayList<>();

    private int id;
    private String name;
    private String phone;
    private String gmail;

    public Customers(int id, String name, String phone, String gmail){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gmail = gmail;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id; 
    }

    public String getName(){
        return name;
    }    

    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getGmail(){
        return gmail;
    } 

    public void setGmail(String gmail){
        this.gmail = gmail;
    }
}
