/** Created by Stasa on 24.11.17.. **/

import java.util.Stack;

public class Brackets{

public static boolean hasBalancedBrackets(String str){

    Stack<Character> stack = new Stack<Character>();
    char x, y;

    for(int i = 0; i < str.length(); i++){
       x = str.charAt(i);

       if ( x == '(' || x == '[' || x == '{' || x == '<' )
            stack.push(x);

       if ( x == ')' || x == ']' || x == '}' || x == '>') {
            if (stack.empty())
            return false;
               
            else {
                y = stack.pop();
       // if( ( x == ')' && y != '(' ) || ( x == ']' && y != '[' ) || ( x == '}' && y != '{' ) || ( x == '>' && y != '<' ) )
                if(x - y != 2 && x - y != 1)
                   return false;
            }
       }
   }

    return stack.empty() ? true : false;
}

public static void main(String[] args)
{
    System.out.println("Brackets are " + ( hasBalancedBrackets("{([kglfk{<hhii>}ngccdfnj])ppll{}[]}") ? "is" : "is not" ) + " balanced" );

  
    System.out.println("Brackets are " + ( hasBalancedBrackets("[<hhhiii()}>]") ? "is" : "is not" ) + " balanced" );
}
