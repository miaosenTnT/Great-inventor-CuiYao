package srv.person;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    /**
    * 学生信息
    * academy学院
    * dormitory宿舍
    * */
    private static final long serialVersionUID= 2963524741253039910L;
    private String name;
    private String ID;
    private int age;
    private String gender;
    private Date birthday;
    private String birthplace;
    private String academy;
    private String dormitory;
    private String password;
    private int state;

    Person(String name,String ID,int age,String gender,Date birthday,
           String birthplace,String academy,String dormitory,String password,int state){
        this.password=password;
        this.name=name;
        this.ID=ID;
        this.age=age;
        this.gender=gender;
        this.birthday=birthday;
        this.birthplace=birthplace;
        this.state=state;
        this.academy=academy;
        this.dormitory=dormitory;
    }


    public String getName() {
        return this.name;
    }
    public String getID() {
        return this.ID;
    }
    public int getAge() {
        return this.age;
    }
    public String getGender() {
        return this.gender;
    }
    public Date getBirthday() {
        return birthday;
    }
    public String getBirthplace() {
        return birthplace;
    }
    public String getAcademy() {
        return this.academy;
    }
    public String getDormitory() {
        return this.dormitory;
    }
    public String getPassword(){return this.password;}
    public int getState(){return this.state;}

    public void setName(String name) {
        this.name = name;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    public void setAcademy(String academy) {
        this.academy = academy;
    }
    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }
    public void setPassword(String password){this.password=password;}
    public void setState(int state){this.state=state;}
}
