package com.dateformat;

import java.io.File;
import java.text.SimpleDateFormat;

public class SimpleDateFormatExampple
{
    public static void main(String[] args)
    {	
        //Specify the file path and name
	File file = new File("C:\\Users\\91966\\Desktop\\java training\\datefile.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
    }
}

