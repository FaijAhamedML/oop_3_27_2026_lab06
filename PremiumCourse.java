package lab06;

public class PremiumCourse extends Course{
    private boolean includeCertification;

    public PremiumCourse (){
        this.includeCertification=false;
    }
    public PremiumCourse(boolean includeCertification) {
        this.includeCertification = includeCertification;
    }
    public PremiumCourse(String courseID, String courseName, int durationWeeks, boolean includeCertification) {
        super(courseID, courseName, durationWeeks);
        this.includeCertification = includeCertification;
    }

    @Override
    public double calculateTotalFee() {
        double certification;
        if (includeCertification==true){
            certification=50.0;
        }else {
            certification=0.0;
        }
        return (150*super.durationWeeks)+certification;
    }



}
