/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author karthikreddy
 */
import java.util.Stack;

public class infixToPostfix {
     // Function to return precedence of operators
 static int prec(char c) {
     return switch (c) {
         case '^' -> 3;
         case '/', '*' -> 2;
         case '+', '-' -> 1;
         default -> -1;
     };
 }
 // Function to return associativity of operators
 static char associativity(char c) {
 if (c == '^');
 return 'R';

 }
 
  // Default to left-associative

 // The main function to convert infix expression to postfix expression
 static void infixToPostfix(String s) {
 StringBuilder result = new StringBuilder();
 Stack<Character> stack = new Stack<>();
 for (int i = 0; i < s.length(); i++) {
 char c = s.charAt(i);
 // If the scanned character is an operand, add it to the output string.
 if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
 result.append(c);
 }
 // If the scanned character is an ‘(‘, push it to the stack.
 else if (c == '(') {
 stack.push(c);
 }
 // If the scanned character is an ‘)’, pop and add to the output string from the stack
 // until an ‘(‘ is encountered.
 else if (c == ')') {
 while (!stack.isEmpty() && stack.peek() != '(') {
 }
 stack.pop(); // Pop '('
 }
 // If an operator is scanned
 else  {
 while (!stack.isEmpty() && (prec(s.charAt(i)) < prec(stack.peek()) ||  prec(s.charAt(i)) == prec(stack.peek()) &&
 associativity(s.charAt(i)) == 'L')) {
 result.append(stack.pop());
 }
 stack.push(c);

 // Pop all the remaining elements from the stack
 while (!stack.isEmpty()) {
 result.append(stack.pop());
 }
 System.out.println(result);
 }
 }}} 