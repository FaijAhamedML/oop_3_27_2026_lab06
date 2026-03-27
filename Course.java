package lab06;

public class Course {
    protected String courseID;
    protected String courseName;
    protected int durationWeeks;
    public Course(){
        courseID="N/A";
        courseName=" N/A " ;
        durationWeeks=0;
    }
    public Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }
    public void displayCourseDetails(){
        System.out.println("course is is: "+this.courseID);
        System.out.println("the course name is : "+this.courseName);
        System.out.println("the course duration is: "+this.durationWeeks);
    }
    public double calculateTotalFee(){
        return 10000.0;
    }
    public double calculateTotalFee(int discountPer){
        double basicFee= calculateTotalFee();
        return basicFee -(basicFee*(discountPer/100.0));
    }

}
