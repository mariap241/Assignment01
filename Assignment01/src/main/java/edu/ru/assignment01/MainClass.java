
package edu.ru.assignment01;

public class MainClass {
    
    
    public static void main(String [] args){
        //create and initialize array1
        String[] array1 = {"apples", "snow", "kitten", "cars"};
        
        //create array2
        String array2[] = new String[4];
        
        //copy data from array1 to array2
        for (int index=0; index< array1.length; index++){
            array2[index]=array1[index];
        }
        //add "_" prefix to array1
        for (int index=0; index< array1.length; index++){
            array1[index]="_"+ array1[index];
        }
        //print array1
        for (String element: array1){
            System.out.println(element);
        }
        //print array2
        for (String element: array2){
            System.out.println(element);
        }
    }
}
