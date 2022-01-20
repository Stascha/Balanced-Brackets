/** Created by Stasa on 24.11.17.. **/

import java.util.Arrays;
import java.util.Stack;

public class Zagrade {

    public static boolean hasBalancedBrackets(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        char x, y;

       for(int i = 0; i < str.length(); i++)
       {
           x = str.charAt(i);

       //  if( Arrays.asList('(' , '[' , '{' , '<').contains(x) )
           if ( x == '(' || x == '[' || x == '{' || x == '<' )
               stack.push(x);

           if ( x == ')' || x == ']' || x == '}' || x == '>')
           {
                if (stack.empty())
                    return false;
                else
                {
                    y = stack.pop();
                    if(x - y != 2 && x - y != 1)
                        
                 // if( ( x == ')' && y != '(' ) || 
                 //     ( x == ']' && y != '[' ) || 
                 //     ( x == '}' && y != '{' ) || 
                 //     ( x == '>' && y != '<' ) 
 
                    return false;
                }
           }
       }

     // if (stack.empty())
     //    return true;
     // else
     //    return false;
     
     // return stack.empty() ? true : false;

        return stack.empty();
    }

    public static void main(String[] args)
    {

        // Zagrade su sve zatvorene
        System.out.println("Brackets are" + ( hasBalancedBrackets("{([kglfk{<hhii>}ngccdfnj])ppll{}[]}") ? " " : " not" ) + " balanced" );

        // Zagrade nisu sve zatvorene
        System.out.println("Brackets are" + ( hasBalancedBrackets("[<hhhiii()}>]") ? " " : " not" ) + " balanced" );
    }

}

