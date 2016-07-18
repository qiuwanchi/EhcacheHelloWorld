package com.secoo.ehcache.EhcacheHelloWorld;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws IOException {
		System.out.println("hahaha".hashCode());
		System.out.println();
		Map<String,String> map = System.getenv();
		
		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("---------------------------");
		
		Properties properties = System.getProperties();
		for(Entry<Object, Object> entry : properties.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.in.read();
		
	}
}
