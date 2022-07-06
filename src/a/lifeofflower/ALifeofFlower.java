
package a.lifeofflower;

import java.util.ArrayList;
import java.util.Scanner;

public class ALifeofFlower {

    public static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> FinalData = new ArrayList<>();
        ArrayList<Integer> temp;
        int count , count2 , data;
        count = inp.nextInt();
        for(int i = 0 ; i < count ; i++){
             temp = new ArrayList<>();
             count2 = inp.nextInt();
             for(int j = 0 ; j < count2 ; j++){
                 data = inp.nextInt();
                 temp.add(data);
            }
            FinalData.add(temp);
            
        }
        for(int i = 0 ; i < FinalData.size() ; i++){
            int Final = 1;
            for(int j = 0; j < FinalData.get(i).size()-1; j++){
                    int k = j + 1;
                    
                    if(FinalData.get(i).get(k) == 1 && FinalData.get(i).get(j) == 1){
                        Final+=5;
                    } 
                    if(FinalData.get(i).get(j) == 1 && FinalData.get(i).get(k) == 1 && j == 0){
                        Final+=1;
                    } 
                    else if(FinalData.get(i).get(k) == 1 && FinalData.get(i).get(j) != 1){
                        Final+=1;
                    }
                    if(FinalData.get(i).get(k) == 0 && FinalData.get(i).get(j) == 0){
                        Final = -1;
                        break;
                    }
                    else if(FinalData.get(i).size()-1 == k ){
                        if(FinalData.get(i).get(k) == 1 && FinalData.get(i).get(j) != 1){
                           Final+=1;
                        }
                    }
                
            }
            System.out.println(Final); 
        }
        
    }
    
}
