 class B {
    int lenght;
    int breadht;
    
    void calc_area(int lenght, int breadht){
        int area = lenght*breadht;
        System.out.println(area);
    }
}

class BB{
    public static void main(String[] args) {
        
        B b= new B();
        b.calc_area(12,4);
    }
}
