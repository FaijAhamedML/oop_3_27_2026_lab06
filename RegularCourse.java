package lab06;

public class RegularCourse extends Course {
    private boolean hasLiveSessions;

    public RegularCourse(){
        hasLiveSessions=false;
    }

    public RegularCourse(boolean hasLiveSessions) {
        this.hasLiveSessions = hasLiveSessions;
    }

    public RegularCourse(String courseID, String courseName, int durationWeeks, boolean hasLiveSessions) {
        super(courseID, courseName, durationWeeks);
        this.hasLiveSessions = hasLiveSessions;
    }

    @Override
    public double calculateTotalFee() {
        return 100*super.durationWeeks;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("live Session Included: "+this.hasLiveSessions);
        System.out.println("Total Fee: "+calculateTotalFee());
        System.out.println("Basic Fee: "+calculateTotalFee());
        System.out.println();
    }


}
