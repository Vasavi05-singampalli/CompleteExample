package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Serialization1
{
  public static void main(String args[])
  {
	  SerializationExample1 obj = new SerializationExample1(101, 25, "Chaitanya", "Agra", 6);
    try{ 
      FileOutputStream fos = new FileOutputStream("Student.ser"); 
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(obj);
      oos.close();
      fos.close();
      System.out.println("Serialzation Done!!");
   }catch(IOException ioe){
      System.out.println(ioe);
    }
  }
}

