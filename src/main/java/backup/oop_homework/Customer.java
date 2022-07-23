package backup.oop_homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    // Te kaut kas nav/trūkst!!

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public boolean isMember(){
        return member;
    }

    public void setMember(Boolean member){
        this.member = member;
    }

    public void setMemberType(String memberType){
        this.memberType = memberType;
    }


    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", member=" + member +
                ", memberType='" + memberType + '\'' + '}';


    }
}
