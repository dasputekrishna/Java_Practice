public class SimpleInterest{

    public static void main(String[] args) {


        double principal = 10000;  
        double rate = 5;          
        double time = 5;        

        double SI = (principal * time * rate) / 100;

        
        System.out.println("SI for Principal amount " + principal + ", Rate " + rate + "%, and Time " + time + " years is: " + SI);
       
                              
    }
}