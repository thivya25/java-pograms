package employee;


import java.io.*;
import java.util.*;
public class OccurrenceOfChar{
   static void count_characters(String input_str){
      HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
      char[] str_array = input_str.toCharArray();// convert string to character
      for (char c : str_array){//{'T','H','I','V','Y','A','','S','H','R','E','E'}
         if (obj.containsKey(c)){
            obj.put(c, obj.get(c) + 1);//H,2, E,2 get(c)--->value of key that is integer here
         }else{
            obj.put(c, 1);//T ,1 H,1 I,1 V,1 Y,1 A,1 "",1 S,1 ,R,1,E,1
         }
      }
      for (Map.Entry entry : obj.entrySet()){
         System.out.println(entry.getKey() + " " + entry.getValue());
      }
   }
   public static void main(String[] args){
      String my_str = "THIVYA SHREE ";
      System.out.println("The occurence of every character in the string is ");
      count_characters(my_str);
   }
}
