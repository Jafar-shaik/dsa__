package geeksforgeeks;

class Phone{
    static int x = 0;
    public Phone(int y){
        x = y;
    }
    public void call(String contact){
        System.out.println("Calling to "+ contact );
    }
    public void camera(){
        System.out.println("Camera is not available in normal phone");
    }
}

//class smartPhone extends Phone{
//    @Override
//    public void camera() {
//        System.out.println("Camera is on");
//    }
//    public void playMusic(){
//        System.out.println("Playing music");
//    }
//}

public class Practice {
    public static void main(String[] args) {
//        Phone obj = new smartPhone();
//        obj.camera();
//        Phone obj = new Phone(4);
//        System.out.println(obj.x);
        double result = (10 * 15.0) / 2;
        System.out.println(result);
    }
}
