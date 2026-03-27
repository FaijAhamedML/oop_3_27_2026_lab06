package lab06;

public class main {
    static void main(String[] args) {
        RegularCourse R1=new RegularCourse();
        PremiumCourse P1=new PremiumCourse("PC202","machine Learning",6,true);

        R1.calculateTotalFee(10);
        P1.calculateTotalFee();
        System.out.println("=== Regular Course (Default Constructor) ===");
        R1.displayCourseDetails();
        System.out.println("=== Premium Course (Parameterized Constructor) ===");
        R1.displayCourseDetails();

    }
}
