/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
import java.io.*;
/** 
 *
 * @author Jamel
 */
public class ChartAt {
  public static void main(String[] args){
  try{
  BufferedReader object=
  new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the String");
  String s=object.readLine();
  int len=s.length();
  System.out.println(len);
  char char1=s.charAt(4);
  System.out.println(char1);
  }
  catch(Exception e){}
  }
}
    
