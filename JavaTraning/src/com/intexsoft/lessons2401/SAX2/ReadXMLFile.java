package com.intexsoft.lessons2401.SAX2;

		import java.io.IOException;

		import javax.xml.parsers.ParserConfigurationException;
		import javax.xml.parsers.SAXParser;
		import javax.xml.parsers.SAXParserFactory;

		import org.xml.sax.SAXException;
		import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLFile {

	public static void main(String argv[])
			throws ParserConfigurationException, SAXException, IOException {

		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();

		DefaultHandler handler = new MySaxParser();
		saxParser.parse("D:\\ermakMichael\\JavaTraning\\src\\com\\intexsoft\\lessons2401\\pointList.xml", handler);
	}

}