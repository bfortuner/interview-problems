
import java.util.ArrayList;
import java.util.List;
import java.io.*;  //InputStream, InputStreamReader, BufferedReader
import math.Counter;

public class Hello {
    
    public int count = 0;

    public static void main(String[] args) {

        System.out.println("Hello World!");
	System.out.println(Integer.toBinaryString(8));

	List<String> l1 = new ArrayList();
	l1.add("A");
	l1.add("B");
	l1.add("C");
	List<String> l2 = new ArrayList(l1);
	for (String s : l2) {
	    System.out.println(s);
	}

	int i = 4;
	String iStr = String.valueOf(i);
	System.out.println(iStr instanceof String);

	Integer iInt = Integer.parseInt(iStr);
	System.out.println(iInt instanceof Integer);

	Double j = 4.5;
	String dStr = Double.toString(i);
	System.out.println(dStr instanceof String);

	Double doub = Double.parseDouble(dStr);
	System.out.println(doub instanceof Double);

	String f = "README.md";
	readFile(f);

	System.out.println("=====================");
	
	String s = "A";
	changeStr(s);
	System.out.println(s.equals("A"));

	Counter c = new Counter();
	increment(c);
	System.out.println(c.count);

    }

    public static void changeStr(String s) {
	s = "e";
    }

    public static void increment(Counter c) {
	c.count = 3;
    }

    public static void readFile(String filename) {
	try {
	     InputStream input = new FileInputStream(filename);
	     InputStreamReader reader = new InputStreamReader(input);
	     BufferedReader buffer = new BufferedReader(reader);
	     String line = buffer.readLine();
	     while (line != null) {
		 System.out.println(line);
		 line = buffer.readLine();
	     }
	} catch (IOException e) {
	    //do nothing
	}	
    }


}
