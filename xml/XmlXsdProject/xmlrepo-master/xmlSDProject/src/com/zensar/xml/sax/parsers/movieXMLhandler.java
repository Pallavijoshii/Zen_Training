package com.zensar.xml.sax.parsers;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class movieXMLhandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		//super.startDocument();
		System.out.print("Starting...");
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		//super.endDocument();
		System.out.print("End of Xml Document");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		//super.startElement(uri, localName, qName, attributes);
		System.out.print("Start Element: "+qName);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		//super.endElement(uri, localName, qName);
		System.out.print("End Element: "+qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//super.characters(ch, start, length);
		for(int i=start;i<(start+length);i++){
			System.out.print(ch[i]);
		}
		System.out.println();
	}

}
