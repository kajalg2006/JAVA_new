 class Student {
    String Rollnumber;
    String name;
    int marks;

    void display(String  Rollnumber, String name, int marks){
        System.out.println(name);
        System.out.println(Rollnumber);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student s1  =new Student(); 
        Student s2  =new Student(); 
        Student s3  =new Student(); 

        s1.display("0245CS231104", "kajal", 46);
        s2.display("0245CS231152", "priyanshi", 46);
        s3.display("0245CS231104", "palak", 36);
        // s1.display("0245CS231104", "kajal", 46);
    }
}
