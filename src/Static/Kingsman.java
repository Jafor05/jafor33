package Static;

public class Kingsman {
    public static void main(String[] args) {
        Kingsman j = new Kingsman();
        j.j1("Nasim","Allrounder");
        j.j1("Rahim","Allrounder");
        j.j1("Ismail","Alrounder");
        j.j1("Kawsar","Bowler");
        j.j2(20);
        j.j2(20);
        j.j2(20);
        j.j2(16);




    }

    void j1 (String name, String name2){
        System.out.println(name + name2);


    }
      void j2 (int age){
          System.out.println(age);
      }
}
