class BThread extends Thread {
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println( getName()+"Thread"+" "+ "downloading.." + i * 20 + "%");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
      
            }
        }
    }
}

class A {
    public static void main(String[] args) {
        BThread a= new BThread();
        BThread b= new BThread();
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }

}
