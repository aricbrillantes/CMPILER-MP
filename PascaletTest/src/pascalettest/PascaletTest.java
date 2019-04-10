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
        BufferedReader reader;
        HashMap<String, String> variables = new HashMap<>(100); 
        HashMap<String, Integer> map = new HashMap<>(100); 
        try 
        {
            reader = new BufferedReader(new FileReader( "/Users/Aric/Desktop/X22_BroDudeTsong.pas"));
            String line = reader.readLine();
            
            while (line != null) 
            {
                if(line.contains("var"))
                {
//                    variables.put()
                    //System.out.println((line.substring(0 , line.indexOf(":"))).replace("    ",""));
                    //System.out.println(line.substring(line.lastIndexOf(":")+2));
                    
                    //
                    map.put((line.substring(0 , line.indexOf(":"))).replace("    ",""), 10); 
                    System.out.println(eval("1+2-3*4/5"));
                    if(line.substring(line.lastIndexOf(":")+2).contains("1"))
                    {
                        //stuff
                    }
                }
                
                if(line.contains(":="))
                {
                    //System.out.println((line.substring(0 , line.indexOf(":"))).replace("    ",""));
                    //System.out.println(line.substring(line.lastIndexOf(":")+2));
                    
                    //
                    map.put((line.substring(0 , line.indexOf(":"))).replace("    ",""), 10); 
                    System.out.println(eval("1+2+3"));
                    if(line.substring(line.lastIndexOf(":")+2).contains("1"))
                    {
                        //stuff
                    }
                }
                
                
                //System.out.println(line);
                
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) { }
    }
}