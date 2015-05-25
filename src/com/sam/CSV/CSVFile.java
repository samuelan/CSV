package com.sam.CSV;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CSVFile {

	String filename;
	List<Row> elements;
	
	
	
	public CSVFile(String f) {
		filename = f;
		elements = new ArrayList<Row>();
	}
	
	public void addRow(Row r){
		elements.add(r);
	}
	
	public void compile() throws Exception{
		ANTLRInputStream input = new ANTLRFileStream(filename);
		CSVLexer lexer = new CSVLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		
		CSVParser parser = new CSVParser(tokens);
		parser.setBuildParseTree(true);
		
		ParserRuleContext prc = parser.file();
		MyCSVListener mcsvl = new MyCSVListener(parser, this);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(mcsvl, prc);
		System.out.print(this.toString());
		//prc.inspect(parser);
	}

	@Override
	public String toString() {
		int i=0;
		StringBuilder sb = new StringBuilder();
		for(Row r: this.elements){
			sb.append("Row "+i++);
			sb.append(r.fields.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	

}
