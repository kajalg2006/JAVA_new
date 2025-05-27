
class AA {
    String firstname = " kajal";
    String laStname = "gupta";

    void fullname() {
        System.out.println(firstname + " " + laStname);
    }
}

class A {
    public static void main(String[] args) {
        AA a = new AA();
        a.fullname();
    }
}
