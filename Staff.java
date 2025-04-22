import java.util.ArrayList;
import java.util.List;

public class Staff extends CinemaTicketSystem1 {
    private static List<Staff> staffMembers = new ArrayList<>();
    
    private int staffId;
    private String name;
    private String nickname;
    private String position;
    private int staffPassword;

    public Staff(int staffId,int staffPassword, String name, String nickname, String position){
        this.staffId = staffId;
        this.staffPassword = staffPassword;
        this.name = name;
        this.nickname = nickname;
        this.position = position;
    }


    public int getStaffId(){
        return staffId;
    }

    public void setStaffId(int staffId){
        this.staffId = staffId; 
    }

    public String getName(){
        return name;
    }    

    public void setName(String name){
        this.name = name;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getPosition(){
        return position;
    } 

    public void setPosition(String position){
        this.position = position;
    }

    public int getStaffPassword(){
        return staffPassword;
    }

    public void setStaffPassword(int staffPassword){
        this.staffPassword = staffPassword;
    }

    public static void staffinformation(){
        staffMembers.add(new Staff(12134, 27368, "Hao Yan", "Carson", "Staff"));
        staffMembers.add(new Staff(12134, 27368, "Hao Yan", "Carson", "Staff"));
        staffMembers.add(new Staff(12134, 27368, "Hao Yan", "Carson", "Staff"));
        staffMembers.add(new Staff(12134, 27368, "Hao Yan", "Carson", "Staff"));
        staffMembers.add(new Staff(12134, 27368, "Hao Yan", "Carson", "Staff"));
        staffMembers.add(new Staff(12134, 27368, "Hao Yan", "Carson", "Staff"));
    }

    

}