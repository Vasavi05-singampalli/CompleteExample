package com.enumDemo;


public class EnumDemo1
{
 Directions dir;
 public EnumDemo1(Directions dir) {
    this.dir = dir;
 }
 public void getMyDirection() {
   switch (dir) {
     case EAST:
        System.out.println("In East Direction");
        break;
                  
     case WEST:
        System.out.println("In West Direction");
        break;
                       
     case NORTH: 
        System.out.println("In North Direction");
        break;
                      
     default:
        System.out.println("In South Direction");
        break;
   }
 }
  
  public static void main(String[] args) {
      EnumDemo1 obj1 = new EnumDemo1(Directions.EAST);
      obj1.getMyDirection();
      EnumDemo1 obj2 = new EnumDemo1(Directions.SOUTH);
      obj2.getMyDirection();
      for (Directions dir : Directions.values()) {
  	    System.out.println(dir);
  	}

  }
  @SuppressWarnings("value")
  public static void getValue(){
	  int a=0;
	
  }
}

