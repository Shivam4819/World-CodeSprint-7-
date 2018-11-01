/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world.codesprint7;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author shivam
 */
public class TwoCharacter {
   public void twoCharacterString(){
        String s="abaacdabd";
        int[] flag=new int[s.length()];
        int[] totalCount=new int[20];
                
        int count=0,k=0;
        char array = 0;
        for(int i=0;i<flag.length;i++){
            flag[i]=0;
        }
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()){
                if(s.charAt(i)==s.charAt(i+1)){
                    array=s.charAt(i);
                    break;
                }
            }
        }
        String str1=Character.toString(array);
        String blank = "";
        String str=s.replace(str1, blank);
        
        if(str.length()==2){
           if(str.charAt(0)!=str.charAt(1)){
               System.out.println("2");
           }
           else{
               System.out.println("0");
           }
        }
        else{
            char[] variable=new char[4];
            for(int i=0;i<str.length();i++){
                for(int j=i;j<str.length();j++){
                    if(flag[j]==0){
                        if(str.charAt(i)==str.charAt(j)){
                            flag[j]=1;
                            count++;
                        }
                    }
                }
                if(count!=0){
                    System.out.println(" value->"+str.charAt(i)+"  count-"+count);
                }
		else if(count==1){
		    totalCount[k++]=count;
                    array=str.charAt(i);
		}
                count=0;
            }
            str1=Character.toString(array);
            String finalstr=str.replace(str1, blank);
            System.out.println("final->"+finalstr.length());
        }
   }
}
