package com.sam.CSV;

import org.antlr.runtime.*;

import com.sam.CSV.CSVParser.FieldContext;
import com.sam.CSV.CSVParser.FileContext;
import com.sam.CSV.CSVParser.RowContext;

public class MyCSVListener extends CSVBaseListener {
    CSVParser parser;
    CSVFile file;
    int rowNum = 0;
	
	public MyCSVListener(CSVParser p, CSVFile f) {
		parser = p;
		file = f;
	}

	

	@Override
	public void exitRow(RowContext ctx) {
		// TODO Auto-generated method stub
		super.exitRow(ctx);
		file.addRow(new Row(ctx));
		
	}

	

	
	

}
