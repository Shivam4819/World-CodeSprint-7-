/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world.codesprint7;

import java.util.Scanner;

/**
 *
 * @author shivam
 */
public class SockMerchant {
    public void sockPairs(){
                Scanner scanner=new Scanner(System.in);
        System.out.println("value 0f n-");
        int n=scanner.nextInt();
        int[] ar=new int[n];
        System.out.println("enter the array data-");
        for(int i=0;i<n;i++){
            ar[i]=scanner.nextInt();
        }
        int[] flag=new int[n];
        
        int temp=0,count=0,pair=0;
        for(int i=0;i<flag.length;i++){
            flag[i]=0;
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(flag[j]==0){
                    if(ar[i]==ar[j]){
                        flag[j]=1;
                        count++;
                    }
                }
            }
            if(count!=0){
                count=count/2;
                pair=pair+count;
            }
            count=0;
        }
        System.out.println("pair->"+pair); 
     
    }
}
