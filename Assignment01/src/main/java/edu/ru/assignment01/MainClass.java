package edu.ru.assignment01;

public class MainClass {
    
    
    public static void main(String[] args){
        
        int[] array1 = {45, 21, 22, 31, 65, 12, 56, 19, 100};
        
        
        int highestElement=highestElement(array1);
        
        System.out.println("The highest element is "+ highestElement);
    }
    public static int highestElement(int[] inputArray){
        
        int highestElement=inputArray[0];
        
        for(int index=0; index<inputArray.length; index++){
            if (inputArray[index]> highestElement)
                highestElement=inputArray[index];
           
        }
        return highestElement;
        
    }

//    public static void main(String[] args) {
//
//        int[] array1 = {45, 21, 22, 31, 65, 12, 56, 19, 100};
//
//        int count = 0;
//        for (int index = 0; index < array1.length; index++) {
//            if (array1[index] % 2 == 0) {
//                count = count + 1;
//            }
//        }
//        int[] array2 = new int[count];
//        array2 = dropOddNumbers(array1);
//
//        for (int element : array2) {
//            System.out.println(element);
//        }
//    }

//    public static int[] dropOddNumbers(int[] arr) {
//        //count the number of even numbers, this'll be the new array length
//        //count number of even numbers
//
//        int count = 0;
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] % 2 == 0) {
//                count = count + 1;
//            }
//        }
//
//        //allocate memory as big as even number count 
//        int[] resultArray = new int[count];
//        int resultArrayIndex = 0;
//
//        //copy even numbers over to new array
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] % 2 != 0) {
//                continue;
//            }
//
//            resultArray[resultArrayIndex] = arr[index];
//            resultArrayIndex++;
//
//        }
//        return resultArray;
//
//    }
}

//    public static void main(String[] args) {
//        //create and initialize array1
//        String[] array1 = {"apples", "snow", "kitten", "cars"};
//
//        //create array2
//        String array2[] = new String[4];
//
//        //copy data from array1 to array2
//        for (int index = 0; index < array1.length; index++) {
//            array2[index] = array1[index];
//        }
//        //add "_" prefix to array1
//        for (int index = 0; index < array1.length; index++) {
//            array1[index] = "_" + array1[index];
//        }
//        //print array1
//        for (String element : array1) {
//            System.out.println(element);
//        }
//        //print array2
//        for (String element : array2) {
//            System.out.println(element);
//        }
//    }
//
//    public static int[] removeElement(int[] inputArray, int n) {
//        int[] arr1 = new int[inputArray.length - 1];
//
//        for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i] == n) {
//                int badVariable = i;
//
//                if (inputArray[i] == badVariable) {
//                    continue;
//                }
//                arr1[i] = inputArray[i];
//
//            }
// 
//        }
//        return arr1;
//    } 

