package pascalettest;

/**
 *
 * @author Aric
 */

import java.io.*;
import java.util.*;

public class PascaletTest 
{
	//evaluation function taken from https://stackoverflow.com/questions/3422673/how-to-evaluate-a-math-expression-given-in-string-form/3423360#3423362
    public static double eval(String str) //final String str
    {
        return new Object() 
        {
            int pos=-1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) 
            {
                while (ch == ' ') 
                	nextChar();
                
                if (ch == charToEat) 
                {
                    nextChar();
                    return true;
                }
                
                return false;
            }

            double parse() 
            {
                nextChar();
                double x = parseExpression();
                
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                	return x;
            }

            double parseExpression() 
            {
                double x = parseTerm();
                for (;;) 
                {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() 
            {
                double x = parseFactor();
                for (;;) 
                {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() 
            {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) 
                { // parentheses
                    x = parseExpression();
                    eat(')');
                } 
                
                else if ((ch >= '0' && ch <= '9') || ch == '.') 
                { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } 
                
                else if (ch >= 'a' && ch <= 'z') 
                { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } 
                
                else 
                {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) 
                	x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
    
    public static boolean containsVar(String str)
    {
    	if (str == null) // checks if the String is null {
            return false;
         
         int len = str.length();
         for (int i = 0; i < len; i++) 
         {
            if ((Character.isLetter(str.charAt(i)) == true)) 
               return true;
         }
         return false;
    }
    
    public static void main(String[] args) 
    {
    	HashMap<String, String[]> global = new HashMap<String, String[]>();
    	HashMap<String, String[]> main = new HashMap<String, String[]>();
    	HashMap<String, String[]> funcproc = new HashMap<String, String[]>();
    	HashMap<String, HashMap<String, String[]>> procOuter = new HashMap<String, HashMap<String, String[]>>();
    	HashMap<String, String[]> procInner;
    	
    	// flag if may naread na procedure or function then magchchange ang pag read sa begin
    	int scopeflag=0;	//0 is global, 1 is procedure or function, 2 is inside main
    	
    	String[] valueAndType = new String[2];
    	
    	BufferedReader reader;
    	BufferedReader reader2;
    	
    	try 
        {
    		//replace with file path of pascal file
            reader = new BufferedReader(new FileReader( "C:\\Users\\Aric\\Desktop\\X22_BroDudeTsong.pas"));
            //reader = new BufferedReader(new FileReader( "C:\\Users\\raf\\Desktop\\X22_BroDudeTsong.pas"));
            String line = reader.readLine();
            
            while (line != null) 
            {
            	
            	if(line.contains("var"))
                {
            		//remove var and data type; only keep variables
            		String splitVariables = line.replace("var", "").replace((line.substring(line.lastIndexOf(":")+1)).toString(),"").replace(";", "").replace(":", "").replace(" ", "");
            		String[] splitVariablesArr = splitVariables.split("[\\, ]");
            		
            		//put variable name as key and value and type as string array value for hashmap;
            		for(int i=0;i<splitVariablesArr.length;i++)
            		{
            			//System.out.println(splitVariablesArr[i]);
            			//valueAndType[0] = "<empty>";//value initially empty, value is for checking if empty
            			//valueAndType[1] = line.substring(line.lastIndexOf(":")+1).replace(";", "").replace(" ", "");
            			if(scopeflag==0)
            			{
            				// Check is key exists in the Map 
            		        boolean isKeyPresent1 = global.containsKey(splitVariablesArr[i]); 
            	            if(isKeyPresent1 == false)
            	            {
            	            	global.put(splitVariablesArr[i], new String[] {"<empty>", line.substring(line.lastIndexOf(":")+1).replace(";", "").replace(" ", "")});
            	            	//System.out.println("Stored in global");
            	            	//System.out.println(Arrays.toString(global.get(splitVariablesArr[i])));
            	            }
            	            else
            	            	System.out.println("Error, duplicate variable/n/n");
            			}
            			if(scopeflag==1)
            			{
            				boolean isKeyPresent2 = funcproc.containsKey(splitVariablesArr[i]); 
            	            if(isKeyPresent2 == false)
            	            {
            	            	funcproc.put(splitVariablesArr[i], new String[] {"<empty>", line.substring(line.lastIndexOf(":")+1).replace(";", "").replace(" ", "")});
            	            	//System.out.println("Stored in funcproc");
            	            	//System.out.println(Arrays.toString(funcproc.get(splitVariablesArr[i])));
            	            }
            	            else
            	            	System.out.println("Error, duplicate variable/n/n");
            			}
            			if(scopeflag==2)
            			{
            				boolean isKeyPresent3 = main.containsKey(splitVariablesArr[i]); 
            	            if(isKeyPresent3 == false)
            	            {
            	            	main.put(splitVariablesArr[i], new String[] {"<empty>", line.substring(line.lastIndexOf(":")+1).replace(";", "").replace(" ", "")});
            	            	//System.out.println("Stored in main");
            	            	//System.out.println(Arrays.toString(main.get(splitVariablesArr[i])));
            	            }
            	            else
            	            	System.out.println("Error, duplicate variable/n/n");
            			}
            		}
                }
            	
            	if(line.contains("procedure")||line.contains("function"))
            		scopeflag=1;
            	
            	if(line.contains("begin")&&scopeflag==0)
            		scopeflag=2;
            	
            	if(line.contains("end"))
            		scopeflag=0;
            	
            	if(line.toLowerCase().contains("procedure"))
                {
//            		System.out.println("\n");
            		int indexctr=0;
            		int semiIndex=0;
            		String procname = line.toLowerCase().replace(" ", "").replaceAll("\\s+","").substring(line.lastIndexOf("procedure")+10, line.indexOf("(")-1);
            		if(!line.replace(" ", "").replaceAll("\\s+","").contains("()"))
            		{
	            		String procparam = line.replace(" ", "").replaceAll("\\s+","").substring(line.lastIndexOf("("),line.lastIndexOf(")")-3).replace(")", "");
	            		procInner = new HashMap<String, String[]>();
	            		
	//            		System.out.println("hi "+procparam.substring(indexctr, procparam.indexOf(":", indexctr)));
	            		boolean isKeyPresent = procOuter.containsKey(line.toLowerCase().replace(" ", "").replaceAll("\\s+","").substring(line.lastIndexOf("procedure")+10, line.indexOf("(")-1)); 
	    	            if(isKeyPresent == false)
	    	            {
	    	        		while(procparam.indexOf(":", indexctr)!=-1)
	    	        		{
	    	        			String[] parameter = procparam.substring(indexctr, procparam.indexOf(":", indexctr)).split("[\\, ]");
	    	        			for(int i=0;i<parameter.length;i++)
	    	            		{
	    	        				
	    	            			procInner.put(parameter[i], new String[] {"<empty>", procparam.substring(procparam.indexOf(":",indexctr)+1, procparam.indexOf(";", semiIndex))});
	    	            			//System.out.println(parameter[i]);
	    	            			//System.out.println("Stored in inner");
	    	            			//System.out.println(Arrays.toString(procInner.get(parameter[i])));
	    	            		}
	    	        			indexctr=procparam.indexOf(";",indexctr);
	    	        			indexctr++;
	    	        			semiIndex=procparam.indexOf(";", indexctr);
	//    	        			semiIndex++;
	    	        		}
	    	        		procOuter.put(line.replace(" ", "").replaceAll("\\s+","").substring(line.lastIndexOf("procedure")+10, line.indexOf("(")-1), procInner);
	    	            }
	    	            else
	    	            {
	    	            	System.out.println("Error, Duplicate Procedure");
	    	            }
            		}
            		else
            		{
            			procInner = new HashMap<String, String[]>();
            			procInner.put("<empty>", new String[] {"<empty>","<empty>"});
            			procOuter.put(line.toLowerCase().replace(" ", "").replaceAll("\\s+","").substring(line.lastIndexOf("procedure")+10, line.indexOf("(")-1),procInner);
            		}
//    	            System.out.println("\n");
    	            
//            		System.out.println(procparam.substring(procparam.indexOf(":",indexctr)+1, procparam.indexOf(";", semiIndex)));
//            		System.out.println(procparam);
            		
                }
            	
                line = reader.readLine();
                
            }
                        
            reader.close();
            
            reader2 = new BufferedReader(new FileReader( "C:\\Users\\Aric\\Desktop\\X22_BroDudeTsong.pas"));
            //reader2 = new BufferedReader(new FileReader( "C:\\Users\\raf\\Desktop\\X22_BroDudeTsong.pas"));
            
            line = reader2.readLine();
            
            while (line != null) 
            {	
            	if(line.contains("procedure")||line.contains("function"))
            		scopeflag=1;
            	
            	if(line.contains("begin")&&scopeflag==0)
            		scopeflag=2;
            	
            	if(line.contains("end"))
            		scopeflag=0;
            	
            	//ignores comments
            	if(line.contains("{") && line.contains("}")) 
            	{
            		if(line.toCharArray()[0] == '{'||line.toCharArray()[line.length()-1] == '}')
        			{
            			line = reader2.readLine();
        			}
            		
            	}
            	
            	//writeLN
            	if(line.contains("writeln(")||line.contains("writeln (")||line.contains("writeln  ("))
            	{
            		//only variables
            		if(!line.contains("\'"))
            		{
                		String splitVars = line.substring(line.indexOf('(')+1,line.indexOf(')'));
                		String[] splitVarsArr = splitVars.substring(splitVars.lastIndexOf("(")+1).replace(";", "").replace(" ","").split(",");
      
//                		System.out.println(Arrays.toString(splitVarsArr));
        		
                		for(int i=0;i<splitVarsArr.length;i++)
                		{
                			if(scopeflag==1)
                			{
                				if(funcproc.containsKey(splitVarsArr[i]))
                				{
                					System.out.print(funcproc.get(splitVarsArr[i])[0]+" ");
                				}
                				
                				else if(global.containsKey(splitVarsArr[i]))
                				{
                					System.out.print(global.get(splitVarsArr[i])[0]+" ");
                				}
                			}
                		}
                		System.out.println();
            		
            		}
            		
            		//only strings
            		if(!line.contains("\',") && !line.contains("', "))
            			System.out.println(line.replace("writeln(","").replace("writeln ('","").replace("writeln (","").replace("writeln (\'","").replace(" (", "").replace("(", "").replace(")", "").replace(" )", "").replace("    ", "").replace(";","").replace("\',", "").replace("\', ", "").replace("'", "").replace("	", "")); 
            		
            		//with variables
            		if(line.contains("\',") || line.contains("', "))
            		{
                		String splitVars = line.replace(" ('", "").replace("('", "").replace(")", "").replace("')", "").replace("    ", "").replace("writeln", "").replace("writeln(","").replace("writeln (","").replace(";","").replace("\',", "<>").replace("\', ", "<>").replace("'", "").replace(", ",",").replace("	", "");
                		String[] splitVarsArr = splitVars.substring(splitVars.lastIndexOf(">")+1).replace(";", "").replace(" ","").split(",");
                		
                		System.out.print(splitVars.substring(0 , splitVars.indexOf("<")));
                		
                		for(int i=0;i<splitVarsArr.length;i++)
                		{
                			if(scopeflag==1)
                			{
                				if(funcproc.containsKey(splitVarsArr[i]))
                					System.out.print(funcproc.get(splitVarsArr[i])[0] + " ");
                				
                				else if(global.containsKey(splitVarsArr[i]))
                					System.out.print(global.get(splitVarsArr[i])[0] + " ");
                			}
                			
                			else if(scopeflag==2)
                			{
                				if(main.containsKey(splitVarsArr[i]))
                					System.out.print(main.get(splitVarsArr[i])[0] + " ");
                				
                				else if(global.containsKey(splitVarsArr[i]))
                					System.out.print(global.get(splitVarsArr[i])[0] + " ");
                			}
                		}
                		System.out.println();
            		}
        		}
            	
            	//write only
            	else if(line.contains("write(")||line.contains("write (")||line.contains("write  ("))
            	{
            		//only variables
            		if(!line.contains("\'"))
            		{
                		String splitVars = line.substring(line.indexOf('(')+1,line.indexOf(')'));
                		String[] splitVarsArr = splitVars.substring(splitVars.lastIndexOf("(")+1).replace(";", "").replace(" ","").split(",");
      
//                		System.out.print(Arrays.toString(splitVarsArr));
        		
                		for(int i=0;i<splitVarsArr.length;i++)
                		{
                			if(scopeflag==1)
                			{
                				if(funcproc.containsKey(splitVarsArr[i]))
                				{
                					System.out.print(funcproc.get(splitVarsArr[i])[0]+" ");
                				}
                				
                				else if(global.containsKey(splitVarsArr[i]))
                				{
                					System.out.print(global.get(splitVarsArr[i])[0]+" ");
                				}
                			}
                		}
            		
            		}
            		
            		//only strings
            		if(!line.contains("\',") && !line.contains("', "))
            			System.out.print(line.replace("write(","").replace("write ('","").replace("write (","").replace("write (\'","").replace(" (", "").replace("(", "").replace(")", "").replace(" )", "").replace("    ", "").replace(";","").replace("\',", "").replace("\', ", "").replace("'", "").replace("	", "")); 
            		
            		//with variables
            		if(line.contains("\',") || line.contains("', "))
            		{
                		String splitVars = line.replace(" ('", "").replace("('", "").replace(")", "").replace("')", "").replace("    ", "").replace("writeln", "").replace("writeln(","").replace("writeln (","").replace(";","").replace("\',", "<>").replace("\', ", "<>").replace("'", "").replace(", ",",").replace("	", "");
                		String[] splitVarsArr = splitVars.substring(splitVars.lastIndexOf(">")+1).replace(";", "").replace(" ","").split(",");
                		
                		System.out.print(splitVars.substring(0 , splitVars.indexOf("<")));
                		
                		for(int i=0;i<splitVarsArr.length;i++)
                		{
                			if(scopeflag==1)
                			{
                				if(funcproc.containsKey(splitVarsArr[i]))
                					System.out.print(funcproc.get(splitVarsArr[i])[0] + " ");
                				
                				else if(global.containsKey(splitVarsArr[i]))
                					System.out.print(global.get(splitVarsArr[i])[0] + " ");
                			}
                			
                			else if(scopeflag==2)
                			{
                				if(main.containsKey(splitVarsArr[i]))
                					System.out.print(main.get(splitVarsArr[i])[0] + " ");
                				
                				else if(global.containsKey(splitVarsArr[i]))
                					System.out.print(global.get(splitVarsArr[i])[0] + " ");
                			}
                		}
            		}
        		}
            	
            	if(line.contains("readln"))
            	{
            		String splitVars = line.substring(line.indexOf('(')+1,line.indexOf(')'));
            		String[] splitVarsArr = splitVars.substring(splitVars.lastIndexOf("(")+1).replace(";", "").replace(" ","").split(",");
            		
            		Scanner scan = new Scanner(System.in);  // Create a Scanner object
            	    String tempscan;  // Read user input
            	    
            		System.out.println(Arrays.toString(splitVarsArr));
            		
            		for(int i=0;i<splitVarsArr.length;i++)
            		{
//            			System.out.println(splitVarsArr[i]);
            			if(scopeflag==1)
            			{
            				if(funcproc.containsKey(splitVarsArr[i]))
            				{
            					tempscan = scan.nextLine();
            					funcproc.get(splitVarsArr[i])[0] = tempscan;
            				}
            				
            				else if(global.containsKey(splitVarsArr[i]))
            				{
            					tempscan = scan.nextLine();
            					global.get(splitVarsArr[i])[0] = tempscan;
            				}
            			}
            			
            			else if(scopeflag==2)
            			{
            				if(main.containsKey(splitVarsArr[i]))
            				{
            					tempscan = scan.nextLine();
            					main.get(splitVarsArr[i])[0] = tempscan;
            				}
            				
            				else if(global.containsKey(splitVarsArr[i]))
            				{
            					tempscan = scan.nextLine();
            					global.get(splitVarsArr[i])[0] = tempscan;
            				}
            			}
            		}
            		scan.close();
        		}
            	
                //evaluation of expressions
            	if(line.contains(":="))
                {
            		//if currently in function, look for variable in function first
            		if(scopeflag==1)
                    {
            			//if variable was found in function
            			//System.out.println((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""));
            			if(funcproc.containsKey((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", "")))
            			{
            				String datatype = funcproc.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[1];
            				//System.out.println((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", "") + " "+ datatype+ " found in function");
            				
            				if(datatype.contains("string"))
        					{
            					funcproc.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[0] = (line.substring(line.lastIndexOf(":")+2)).replace(";", "").replace("\"","");
            					//System.out.println(funcproc.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[0]);
        					}
            				
            				if(datatype.contains("integer"))
            				{
            					//if expression to be evaluated only has constants
            					if(!containsVar((line.substring(line.lastIndexOf(":")+2)).replace(";", "")))
            					{
            						int temp = (int) eval((line.substring(line.lastIndexOf(":")+2)).replace(";", ""));
            						funcproc.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[0] = Integer.toString(temp) ;
            						//System.out.println(funcproc.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[0]);
            					}
            					
            					else
            					{
            	            		String[] splitVarsArr = line.substring(line.lastIndexOf("=")+1,line.lastIndexOf(";")).split("[-+*/]");
            	            		String[] splitOpsArr = line.substring(line.lastIndexOf("=")+2,line.lastIndexOf(";")).split("[abcdefghijklmnopqrstuvwxy]");
            	            		String toEval=splitVarsArr[0];
            	            		System.out.println(Arrays.toString(splitVarsArr));
            	            		System.out.println(Arrays.toString(splitOpsArr));
            	            		
            	            		if(splitVarsArr.length>1)
        	            			{
            	            			for(int i=0;i<splitVarsArr.length;i++)
            	            			{
            	            				
                	            			if(containsVar(splitVarsArr[i])) 
                	            			{
//                	            				splitVarsArr[i]=funcproc.get(splitVarsArr[i])[0];
                	            				System.out.println(splitVarsArr[i]);
                	            			}
                	            			
                	            		}
//            	            			System.out.println(toEval);
        	            			}
            	            		
            					}
            				}     
            			
            				if(datatype.contains("float"))
            				{
            					if(containsVar((line.substring(line.lastIndexOf(":")+2)).replace(";", "")))
            					{
            						
            					}
            					
            					//if expression to be evaluated only has constants
            					if(!containsVar((line.substring(line.lastIndexOf(":")+2)).replace(";", "")))
            					{
            						funcproc.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[0] = Double.toString(eval((line.substring(line.lastIndexOf(":")+2)).replace(";", "")));
            						//System.out.println(funcproc.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[0]);
            					}
            				}     
            				
            				if(datatype.contains("boolean"))
            				{
            					
            				}    
            				
            				if(datatype.contains("char"))
            				{
            					funcproc.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[0] = (line.substring(line.lastIndexOf(":")+2)).replace(";", "").replace("\"","").replace("'", "");
            					
            				}     
            			}
            			
            				
            			//if variable was not found in function, look in global declarations
            			else if(global.containsKey((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", "")))
            			{
            				String datatype = global.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[1];
            				//System.out.println((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", "") + " "+ datatype+ " found in global");
            				
            				if(datatype.contains("string"))
            				{

            				}
            				
            			
            				if(datatype.contains("integer"))
        					{
                				
        					}
            				
            				
            				if(datatype.contains("float"))
            				{
            					//funcproc.get((line.substring(0 , line.indexOf(":"))).replace("    ","").replace("	", ""))[0] = Double.toString(eval((line.substring(line.lastIndexOf(":")+2)).replace(";", "")));
            				}            
            			}
                    }
                }
            	
                line = reader2.readLine();
                
            }
            
            reader2.close();
            System.out.println("\n\nProgram end");
        } 
    	catch (IOException e) { }
    }
}