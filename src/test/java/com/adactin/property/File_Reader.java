package com.adactin.property;

import java.io.File;

import com.adactin.helper.Configuration_Reader;

public class File_Reader {

	public File_Reader() {
	
	
	}
public  Configuration_Reader getinstanceCR() throws Throwable {
	Configuration_Reader reader=new Configuration_Reader();
return reader;
}

public static  File_Reader getinstance() {
File_Reader helper=new File_Reader();
return helper;
}
}
			 