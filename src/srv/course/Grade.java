package srv.course;

import java.io.Serializable;
/*
* 学生成绩
* */

public class Grade implements Serializable {
    private static final long serialVersionUID= -1290451614230058291L;
    private String courseName;
    private int courseGrade;
    private String EcardNUmber;
    private String courseSemeter;

    public Grade(String courseName,String courseSemeter,int courseGrade,String EcardNUmber) {
            this.courseGrade=courseGrade;
            this.courseName=courseName;
            this.EcardNUmber=EcardNUmber;
            this.courseSemeter=courseSemeter;
    }


    public String getCourseName() {
        return this.courseName;
    }
    public int getCourseGrade() {
        return this.courseGrade;
    }
    public String getEcardNUmber() {
        return this.EcardNUmber;
    }
    public String getCourseSemeter() {
        return this.courseSemeter;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseGrade(int courseGrade) {
        this.courseGrade = courseGrade;
    }
    public void setEcardNUmber(String EcardNUmber) {
        this.EcardNUmber = EcardNUmber;
    }
    public void setCourseSemeter(String courseSemeter) {
        this.courseSemeter = courseSemeter;
    }

}
