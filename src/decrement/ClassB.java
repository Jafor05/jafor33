package decrement;

public class ClassB {
    int b = 10;

    public static void main(String[] args) {
        ClassA ref1 = new ClassA();
        ref1.n1();

        ClassB ref2 = new ClassB();
        ref2.m2();

        int sum = ref1.a + ref2.b;
        System.out.println(sum);
    }


    void m2(){
        System.out.println("this is from ClassB");

    }
    void n2(){
        String outside = "Raining";
       if(outside.equals("Raining")){
           System.out.println("Stay home");
       } else{
           System.out.println("enjoy");
       }
    }


}
