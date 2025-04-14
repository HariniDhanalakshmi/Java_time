// Source code is decompiled from a .class file using FernFlower decompiler.
public class Booltest {
    public Booltest() {
    }
 
    public static void main(String[] var0) {
       boolean var1 = false;
       System.out.println("b is " + var1);
       var1 = true;
       System.out.println("b is " + var1);
       if (var1) {
          System.out.println("This is executed");
       }
 
       var1 = false;
       if (var1) {
          System.out.println("This is not executed");
       }
 
       System.out.println("10 > 91 is false");
    }
 }
 