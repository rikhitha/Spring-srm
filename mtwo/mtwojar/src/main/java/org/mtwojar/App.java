package org.mtwojar;

import org.apache.commons.lang3.StringUtils;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String string = "www.Rikhiww.com.hai.com";
        int charNum = StringUtils.countMatches(string, 'w');
        int stringNum = StringUtils.countMatches(string, "com");
         
        System.out.println(charNum);
        System.out.println(stringNum);
    }
}
