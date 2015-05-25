package com.sam.CSV;
/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/



public class testCSV {
	
	
	public static void main(String[] args) throws Exception {
		CSVFile csv = new CSVFile(args[0]);
		csv.compile();
		
		
	}
}
