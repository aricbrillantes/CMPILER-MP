package pascalettest;

/**
 *
 * @author Aric
 */
import java.io.*;
import java.util.*;

public class PascaletTest 
{
    public static double eval(final String str) 
    {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
    
    public static void main(String[] args) 
    {
    	HashMap<String, String[]> global = new HashMap<String, String[]>();
    	HashMap<String, String[]> main = new HashMap<String, String[]>();
    	HashMap<String, String[]> funcproc = new HashMap<String, String[]>();
    	
    	int scopeflag=0;	//0 is global, 1 is procedure or function, 2 is inside main
    	
    	String[] valueAndType = new String[2];
    	// flag if may naread na procedure or function then magchchange ang pag read sa begin
    	BufferedReader reader;
    	
    	try 
        {
            reader = new BufferedReader(new FileReader( "C:\\Users\\Aric\\Desktop\\X22_BroDudeTsong.pas"));
            String line = reader.readLine();
            
            while (line != null) 
            {
            	if(line.contains("var"))
                {
            		//remove var and data type; only keep variables
            		//still not separated per variable
            		//System.out.println(line.replace("var", "").replace((line.substring(line.lastIndexOf(":")+1)).toString(),"").replace(";", "").replace(":", "").replace(" ", "")); 
            		
            		//now separated per variable
            		String splitVariables = line.replace("var", "").replace((line.substring(line.lastIndexOf(":")+1)).toString(),"").replace(";", "").replace(":", "").replace(" ", "");
            		String[] splitVariablesArr = splitVariables.split("[\\, ]");
            		
            		//put variable name as key and value and type as string array value for hashmap;
            		for(int i=0;i<splitVariablesArr.length;i++)
            		{
            			System.out.println(splitVariablesArr[i]);
            			valueAndType[0] = "-6969";//value initially empty, value is for checking if empty
            			valueAndType[1] = line.substring(line.lastIndexOf(":")+1).replace(";", "").replace(" ", "");
            			if(scopeflag==0)
            			{
            				// Check is key exists in the Map 
            		        boolean isKeyPresent1 = global.containsKey(splitVariablesArr[i]); 
            	            if(isKeyPresent1 == false)
            	            {
            	            	global.put(splitVariablesArr[i], valueAndType);
            	            	System.out.println("Stored in global");
            	            	System.out.println(Arrays.toString(global.get(splitVariablesArr[i])));
            	            }
            	            else
            	            	System.out.println("Error, duplicate variable/n/n");
            			}
            			if(scopeflag==1)
            			{
            				boolean isKeyPresent2 = funcproc.containsKey(splitVariablesArr[i]); 
            	            if(isKeyPresent2 == false)
            	            {
            	            	funcproc.put(splitVariablesArr[i], valueAndType);
            	            	System.out.println("Stored in funcproc");
            	            	System.out.println(Arrays.toString(funcproc.get(splitVariablesArr[i])));
            	            }
            	            else
            	            	System.out.println("Error, duplicate variable/n/n");
            			}
            			if(scopeflag==2)
            			{
            				boolean isKeyPresent3 = main.containsKey(splitVariablesArr[i]); 
            	            if(isKeyPresent3 == false)
            	            {
            	            	main.put(splitVariablesArr[i], valueAndType);
            	            	System.out.println("Stored in main");
            	            	System.out.println(Arrays.toString(main.get(splitVariablesArr[i])));
            	            }
            	            else
            	            	System.out.println("Error, duplicate variable/n/n");
            			}
            		}
            		//print entire array of variables
            		//System.out.println(Arrays.toString(tokens));
            		
            		//get data type
            		System.out.println(line.substring(line.lastIndexOf(":")+1).replace(";", "").replace(" ", ""));
                }
            	
            	if(line.contains("procedure")||line.contains("function"))
            		scopeflag=1;
            	
            	if(line.contains("begin")&&scopeflag==0)
            		scopeflag=2;
            	
            	if(line.contains("end"))
            		scopeflag=0;
            		
                line = reader.readLine();
                
            }
            reader.close();
        } 
    	catch (IOException e) { }
    }
}