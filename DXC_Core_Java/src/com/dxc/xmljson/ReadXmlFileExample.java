package com.dxc.xmljson;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXmlFileExample {
	public static void main(String[] args) throws Exception {

		File mFile = new File("C:\\Users\\lenovo\\Desktop\\xmlfiledata.xml");

		// creating instance of BuilderFactory to create a document builder
		// which builds document for it to read
		DocumentBuilderFactory mFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder mBuilder = mFactory.newDocumentBuilder();

		Document mDocument = mBuilder.parse(mFile);

		// Puts all Text nodes in the full depth of the sub-treeunderneath this
		// Node,
		// including attribute nodes, into a"normal" form where only structure
		mDocument.getDocumentElement().normalize();

		System.out.println("Root Element of Doc is " + mDocument.getDocumentElement().getNodeName());

		/************************
		 * EMPLOYEE NODES
		 ************************************/
		// Nodelist creates the list of nodes
//		NodeList mNodeList = mDocument.getElementsByTagName("employee");
//
//		for (int i = 0; i < mNodeList.getLength(); i++) {
//			Node mNode = mNodeList.item(i);
//			System.out.println("\nNode Name is " + mNode.getNodeName());
//
//			if (mNode.getNodeType() == Node.ELEMENT_NODE) {
//				Element mElement = (Element) mNode;
//				System.out.println("Id is: " + mElement.getElementsByTagName("id").item(0).getTextContent());
//				System.out.println("Name is: " + mElement.getElementsByTagName("name").item(0).getTextContent());
//				System.out.println("Address is: " + mElement.getElementsByTagName("address").item(0).getTextContent());
//			}
//		}

		/*****************************
		 * ENGINEER NODES
		 *******************************/

		// Nodelist creates the list of nodes
		NodeList mNodeList1 = mDocument.getElementsByTagName("engineer");

		for (int i = 0; i < mNodeList1.getLength(); i++) {
			Node mNode1 = mNodeList1.item(i);
			System.out.println("\nNode Name is " + mNode1.getNodeName());

			if (mNode1.getNodeType() == Node.ELEMENT_NODE) {
				Element mElement1 = (Element) mNode1;
				System.out.println("Id is: " + mElement1.getElementsByTagName("domain").item(0).getTextContent());
				System.out.println("Name is: " + mElement1.getElementsByTagName("technology").item(0).getTextContent());
			}
		}
	}
}
