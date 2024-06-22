class ObjToPemitive {
    public static void main(String[] args) {
  
      // creates objects of wrapper class
      Integer obj1 = Integer.valueOf(45);
      Double obj2 = Double.valueOf(5.87);
      Boolean obj3 = Boolean.valueOf(false);
      Character obj4 = Character.valueOf('S');
  
      // converts into primitive types
      int a = obj1.intValue();
      double b = obj2.doubleValue();
      boolean c = obj3.booleanValue();
      char d = obj4.charValue();
  
      // print the primitive values
      System.out.println("The value of int variable: " + a);
      System.out.println("The value of double variable: " + b);
      System.out.println("The value of boolean variable: " + c);
      System.out.println("The value of character variable: " + d);
    }
  }