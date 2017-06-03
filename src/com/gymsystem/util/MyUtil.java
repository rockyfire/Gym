package com.gymsystem.util;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class MyUtil {

	/**
	 * 字符串转换成日期
	 * @param text
	 * @return
	 */
	public static Date strToDate(String text){
		try {
			Date date=new SimpleDateFormat("yyyy-MM-dd").parse(text);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 * ����û���ţ���ɹ����ǣ�����+��λ�����
	 * 
	 * @return
	 */
	public static String createUserNumber(){
		String userNumber;
		int random = new Random().nextInt(10000);
		Calendar calendar = Calendar.getInstance();
		int monthint = calendar.get(Calendar.MONTH)+1;
		String month;
		if(monthint<10){
			month = "0"+ monthint;
		}else{
			month = monthint+"";
		}
		userNumber = calendar.get(Calendar.YEAR)+month+calendar.get(Calendar.DAY_OF_MONTH)+random;
		return userNumber;
	};
	
	/**
	 * 
	 * ��һ�����������ֵװ��һ��map ��
	 * 
	 * @param object
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static Map<String,Object> objectToMap(Object object) throws IllegalArgumentException, IllegalAccessException{
		Map<String,Object> fieldMap = new HashMap<>();
		Class clazz =  object.getClass();
		System.out.println(clazz.getSimpleName());
		Field[] fields =  clazz.getDeclaredFields();
		for(Field field:fields){
			field.setAccessible(true);
			fieldMap.put(field.getName(), field.get(object));
		}
		return fieldMap;
	}


	/**
	 * ͨ��object �õ�һ��hql �ַ�
	 * 
	 * @param object
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static <T> String getHqlFromObject(Object object) throws IllegalArgumentException, IllegalAccessException{
		Class clazz = object.getClass();
		Map<String,Object> map = objectToMap(object);
				
		StringBuilder builder = new StringBuilder();
		builder.append("from "+clazz.getSimpleName()+" where 1=1");
		
		for(Entry<String,Object>entry:map.entrySet()){
			if(!entry.getValue().equals("")){
                builder.append(" and " + entry.getKey()+"=:" + entry.getKey());
            }
		}
		return builder.toString();
	}
}










