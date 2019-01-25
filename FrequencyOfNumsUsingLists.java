// Author: Marcelo Mariduena

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FrequencyOfNumsUsingLists {
  public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);
      int temp = -2;
      
      // Empty list of integers created
      List<Integer> intList = new ArrayList<Integer>();
      
      // Prompt user for inputs
      System.out.println("Enter integer numbers between 0 and 12 separated by space (enter -1 to finish): ");
      
      // While loop which adds inputted integers into the list so long as the last int is not "-1"
      while (temp != -1){
        temp = input.nextInt();
        intList.add(temp);
      }
      
      System.out.println("--- Frequencies ---");
      
      // Calls method
      outputNumStats(intList);
      
      input.close();
      
  }
  public static void outputNumStats(List<Integer> listOfIntegers){
    int freqOf0 = 0;
    int freqOf1 = 0;
    int freqOf2 = 0;
    int freqOf3 = 0;
    int freqOf4 = 0;
    int freqOf5 = 0;
    int freqOf6 = 0;
    int freqOf7 = 0;
    int freqOf8 = 0;
    int freqOf9 = 0;
    int freqOf10 = 0;
    int freqOf11 = 0;
    int freqOf12 = 0;
      
    // Iterate through all the integers in the array
    for (Integer i: listOfIntegers){
      switch (i){
        case 0:
        freqOf0++;
        break;
        case 1:
        freqOf1++;
        break;
        case 2:
        freqOf2++;
        break;
        case 3:
        freqOf3++;
        break;
        case 4:
        freqOf4++;
        break;
        case 5:
        freqOf5++;
        break;
        case 6:
        freqOf6++;
        break;
        case 7:
        freqOf7++;
        break;
        case 8:
        freqOf8++;
        break;
        case 9:
        freqOf9++;
        break;
        case 10:
        freqOf10++;
        break;
        case 11:
        freqOf11++;
        break;
        case 12:
        freqOf12++;
        break;
      }
    }
    System.out.println("[0]" + " -> " + freqOf0);
    System.out.println("[1]" + " -> " + freqOf1);
    System.out.println("[2]" + " -> " + freqOf2);
    System.out.println("[3]" + " -> " + freqOf3);
    System.out.println("[4]" + " -> " + freqOf4);
    System.out.println("[5]" + " -> " + freqOf5);
    System.out.println("[6]" + " -> " + freqOf6);
    System.out.println("[7]" + " -> " + freqOf7);
    System.out.println("[8]" + " -> " + freqOf8);
    System.out.println("[9]" + " -> " + freqOf9);
    System.out.println("[10]" + " -> " + freqOf10);
    System.out.println("[11]" + " -> " + freqOf11);
    System.out.println("[12]" + " -> " + freqOf12);
  }
}