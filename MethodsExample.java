public class Methods1 {  
    static void greet() {  
        System.out.println("Hello from the static method!");  
    }  
    public void farewell() {  
        System.out.println("Goodbye from a non-static method!");  
    }  
    public static void main(String args[]) {  
        Methods1 obj = new Methods1();  
        obj.farewell();
        Methods1.greet(); 
    }  
}  