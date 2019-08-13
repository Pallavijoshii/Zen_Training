package com.zensar.xml.sax.parsers;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MovieXmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	SAXParserFactory factory = SAXParserFactory.newInstance();
    
     SAXParser parser=factory.newSAXParser();
     parser.parse(new File("./src/moviesdetails.xml"),new MoviesXmlHandler());
	}
	catch(Exception e)
	{
		
	}

}}
