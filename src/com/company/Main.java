package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CourseRegistration courseRegistration = new CourseRegistration("Peter",5001,58,1005,true);
        validate(courseRegistration);
        CourseRegistration courseRegistration1 = new CourseRegistration("Peter",5001,68,1006,true);
        validate(courseRegistration1);
        CourseRegistration courseRegistration2 = new CourseRegistration("Peter",5001,78,1005,false);
        validate(courseRegistration2);


    }

    public static void validate(CourseRegistration courseRegistration){
        if(courseRegistration.validateMarks())
            if(courseRegistration.validateCourseId()){
                courseRegistration.calculateCourseFee();
                System.out.println("*****************Course Allocation Details*****************");
                System.out.println("       Student Name                   :"+courseRegistration.getStudentName());
                System.out.println("       Course Id                      :"+courseRegistration.getCourseId());
                System.out.println("       Qualifying Exam Marks          :"+courseRegistration.getQualifyingMarks());
                System.out.println("       Student's Registration Id      :"+courseRegistration.getRegistrationId());
                System.out.println("       Total course fee               :"+courseRegistration.getCourseFee());
                System.out.println("       Hostel Required                :"+(courseRegistration.isHostelRequired() ? "Yes": "No"));

            }
            else
                System.out.println("Invalid Course Id. Please try again!!");
        else
            System.out.println("Marks is less than 65. You are not eligible for admission!!");

    }
}
