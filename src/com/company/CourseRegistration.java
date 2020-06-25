package com.company;

public class CourseRegistration {
    private String studentName;
    private int registrationId;
    private float qualifyingMarks;
    private double courseFee;
    private int courseId;
    private boolean hostelRequired;

    public CourseRegistration(String studentName, int registrationId, float qualifyingMarks, int courseId, boolean hostelRequired) {
        this.studentName = studentName;
        this.registrationId = registrationId;
        this.qualifyingMarks = qualifyingMarks;
        this.courseId = courseId;
        this.hostelRequired = hostelRequired;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public float getQualifyingMarks() {
        return qualifyingMarks;
    }

    public void setQualifyingMarks(float qualifyingMarks) {
        this.qualifyingMarks = qualifyingMarks;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public boolean isHostelRequired() {
        return hostelRequired;
    }

    public void setHostelRequired(boolean hostelRequired) {
        this.hostelRequired = hostelRequired;
    }

    public boolean validateMarks(){
        return this.qualifyingMarks >= 65 && this.qualifyingMarks <=100;
    }

    public boolean validateCourseId(){
        return this.courseId>=1001 && this.courseId<=1005;

    }

    public void calculateCourseFee(){
        this.courseFee=0;
        switch (this.courseId) {
            case 1001 -> this.courseFee = 55000;
            case 1002 -> this.courseFee = 35675;
            case 1003 -> this.courseFee = 28300;
            case 1004 -> this.courseFee = 22350;
            case 1005 -> this.courseFee = 115000;
        }
        if (this.qualifyingMarks >=65 && this.qualifyingMarks<=69)
            this.courseFee=this.courseFee*.95;
        else if (this.qualifyingMarks >= 70 && this.qualifyingMarks <=84)
            this.courseFee = this.courseFee*.9;
        else
            this.courseFee =this.courseFee*.85;

    }


}
