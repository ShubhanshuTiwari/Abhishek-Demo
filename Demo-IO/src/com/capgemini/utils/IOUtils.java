package com.capgemini.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class IOUtils {

	public static boolean readPrimitives(InputStream in) throws IOException{
		
		BufferedInputStream bIn =  new BufferedInputStream(in);
		
		DataInputStream dIn = new DataInputStream(bIn);
		
		try{
			long lValue = dIn.readLong();
			System.out.println(lValue);
			
			boolean flag = dIn.readBoolean();
			System.out.println(flag);
			
		
			
			
		}finally{
			
			if(dIn != null)
				dIn.close();
		}
		
		return true;
	}
	
	
	public static boolean writePrimitives(OutputStream out) throws IOException{

//		try with resources
		try(DataOutputStream dOut = new DataOutputStream(out)){
			
			dOut.writeLong(1L);
			dOut.writeBoolean(false);
		}
		

		
		
		
		
		return true;
		
		
	}
	
	
	
	
	
	
}
