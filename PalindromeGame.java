import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeGame{
    
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new java.util.LinkedList<Character>();

    void pushCharacter(Character ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    char popCharacter(){
        return stack.pop();
    }

    char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a word to check whether it is a Palindrome or not ");
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        PalindromeGame p = new PalindromeGame();

        
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}