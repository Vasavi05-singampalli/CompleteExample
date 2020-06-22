package com.inputoutputOpperations;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExerciseProblem1 {

	public static void main(String[] args) {
		File inputfile=new File("C:\\Vasavi\\vasufile.txt");		
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		File outputfile;
		FileOutputStream fos=null;
		//String mycontent=null;
		StringBuffer mycontent=new StringBuffer();
		
		try{
			fis=new FileInputStream(inputfile) ;
			bis=new BufferedInputStream(fis);
			while(bis.available()>0){
				char obj=(char)bis.read();//obj=i
				//System.out.println(obj);				
				mycontent.append(obj);//str=i									
			}	
			System.out.println(mycontent);	
			
			outputfile=new File("C:\\Vasavi\\outputfile.txt");
			fos=new FileOutputStream(outputfile);
			if(!outputfile.exists()){
				outputfile.createNewFile();
			}
			byte[] bytearr=mycontent.toString().getBytes();
			fos.write(bytearr);
			fos.flush();
			//System.out.println("Output file written successfully.");
		}catch(FileNotFoundException fnfe){
			System.out.println("Exception occurs: "+fnfe);
		}catch(IOException ioe)
        {
            ioe.printStackTrace();
			System.out.println("I/O Exception: " + ioe); 
        }finally{
        	try{
        		if(bis!=null && fis!=null && fos!=null){
        			fis.close();
        			bis.close();
        			fos.close();
        		}
        	}catch(IOException ioe){
        		System.out.println("Error in input stream close ioe: "+ioe);
        	}
        }

	}

}
