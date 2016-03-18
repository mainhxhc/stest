package com.ai.data;

public class EnumData {

	// 1. 定义枚举类型
    public enum ElementType {
       // 利用构造函数传参
    	xpath, name, id,className,linkText,tagName,partialLinkText,cssSelector;
 
    
    }
    
    public enum BrowerType {
        // 利用构造函数传参
     	IE, CHROME, FIREFOX, REMOTE;
     	
     }
    
    public enum AssertionType {
        // 利用构造函数传参
     	keyword, element, FIREFOX, REMOTE;
     	
     }
}
