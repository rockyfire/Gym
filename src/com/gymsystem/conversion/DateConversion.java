package com.gymsystem.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

public class DateConversion extends StrutsTypeConverter{

	
	private final DateFormat[]dfs=
        {
            new SimpleDateFormat("yyyy-MM-dd"),
        };
	
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		
		String value = arg1[0];
		 //遍历日期支持格式，进行转换
        for (int i = 0; i < dfs.length; i++) {
            try {
                return dfs[i].parse(value);
            } catch (Exception e) {
                continue;
            }
        }
		throw new TypeConversionException();
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		return new SimpleDateFormat("yyyy-MM-dd").format(arg1);
	}

}
