/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world.codesprint7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author shivam
 */
public class GridlandTrain {
 
    public void lampPost(){
        Scanner scanner=new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int track = scanner.nextInt();
        int sum=0;
        int mat[][]=new int[track][3];
        for(int i=0;i<track;i++){
            System.out.println("Enter three seperated values:-");
            int rowNo=scanner.nextInt();
            int start= scanner.nextInt();
            int end=scanner.nextInt();
            mat[i][0]=rowNo;
            mat[i][1]=start;
            mat[i][2]=end;
        }
        for(int i=0;i<track;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++)
                System.out.print(" "+mat[i][j]);
        }
        
        int temp;
        int k=0;
        int inc=0;
        for(int i=0;i<track;i++){
            ArrayList<Integer> startList = new ArrayList<>();
            ArrayList<Integer> endList = new ArrayList<>();
            temp=mat[i][0];
            if(mat[i][0]!=-1){
                for(int j=i;j<track;j++){
                    if(temp==mat[j][0]){
                        mat[j][0]=-1;
                        startList.add(mat[j][1]);
                        endList.add(mat[j][2]);
                    }
                }
                ArrayList<Integer> arr = new ArrayList<>();
                Set<Integer> set = new HashSet<>();
                for(int n=0;n<startList.size();n++){
                    if(Math.abs(startList.get(n)-endList.get(n))==1){
                        arr.add(startList.get(n));
                        arr.add(endList.get(n));
                    }
                    else if(Math.abs(startList.get(n)-endList.get(n))>1){
                        for(int begin=startList.get(n)+1;begin<=endList.get(n)-1;begin++)
                            arr.add(begin);
                        arr.add(startList.get(n));
                        arr.add(endList.get(n));
                    }
                    else if(Math.abs(startList.get(n)-endList.get(n))==0){
                        arr.add(startList.get(n));
                    }
                }
                System.out.println("result:-"+arr);
                for(int size=0;size<arr.size();size++)
                    set.add(arr.get(size));
                System.out.println("set:-"+set);
                sum= sum+set.size();
                System.out.println("sum:-"+sum);
            }
        }
        int lamp = (row*col)-sum;
        System.out.println("lamp:-"+lamp);
    }
}
