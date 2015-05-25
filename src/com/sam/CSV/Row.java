package com.sam.CSV;

import java.util.ArrayList;
import java.util.List;

public class Row {

	List<String> fields;
	
	public Row(CSVParser.RowContext rowCtx) {
		
       fields = new ArrayList<String>();
       for(CSVParser.FieldContext fc: rowCtx.field()){
    	   fields.add(fc.getText());
       }
	}

}
