
package edu.ru.assignment01;

public class MainClass {
    
    
    public static void main(String [] args){
        
        String[] array1 = {"apples", "snow", "kitten", "cars"};
        
        String array2[] = new String[4];
        
        for (int index=0; index< array1.length; index++){
            array2[index]=array1[index];
        }
      
        for (int index=0; index< array1.length; index++){
            array1[index]="_"+ array1[index];
        }
        for (String element: array1){
            System.out.println(element);
        }
        for (String element: array2){
            System.out.println(element);
        }
    }
}
