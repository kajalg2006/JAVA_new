
// public class Example {public static void main(String[] args) {

//     AThread a= new AThread();
//     a.start();
//    }
// }
// class AThread extends Thread{
//     public void run(){

//     }
// }

// public class Example {
//     public static void main(String[] args) {

//     AThread a= new AThread();
//     a.start();
//     System.out.println("hello");
//    }
// }
// class AThread extends Thread{
//     public void run(){

//         System.out.println("ji");
//         try{
//             Thread.sleep(2000);
//         }
//         catch(InterruptedException e){

//         }
//     }
// }
class Downloadfile {
    public static void file(String f) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(f + "downloading.." + i * 20 + "%");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            System.out.println();
        }
    }
}

class Example {
    public static void main(String[] args) {
        Downloadfile.file("A");
        Downloadfile.file("B");
    }
}