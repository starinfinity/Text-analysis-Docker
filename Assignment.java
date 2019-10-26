/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author RahulGahlot<gahlotrl@mail.uc.edu>
 */
public class Assignment {
    private static ArrayList<File> file_List;
    private static HashMap<String,Integer> freq_word;
   
    public static void main(String[] args) throws FileNotFoundException 
         {
    file_List= new ArrayList<File>();
    int min=Integer.MAX_VALUE;
    String max_String=null;
    String min_String=null;
    int max=Integer.MIN_VALUE;
     File curDir = new File(".");
        HashSet<String> fs = new HashSet<String>();
        
       freq_word= new HashMap<>();
        getAllFiles(curDir);
       
        
        
             System.out.println("Total Number of Files "+file_List.size());
             System.out.println("File names are below :");
       for(File F:file_List)
       {
          System.out.println(F.getName());
           getWordsFreq(F);
          
       }
       
       
       
       file_List.clear();
       int count=0; 
    for(Entry<String, Integer> entry : freq_word.entrySet()) {
    String key = entry.getKey();
    Integer value = entry.getValue();
    count+=value;
    if(value>max)
    {
        max=value;
        max_String=key;
        
    }else{ if(min>value)
    {
        min=value;
        min_String=key;
    }
        
        
    }
    
    
    
}
	System.out.println(" _________________________________________________________________________________________");
    System.out.println("|Number of Words of Minimum 5 Length are        | "+count);         
    if(min!=Integer.MAX_VALUE)
    {
	System.out.println("|_________________________________________________________________________________________");
    System.out.println("|Min Frequency word is                          | "+min_String);
	System.out.println("|_________________________________________________________________________________________");
        
              System.out.println("|Its Frequency is                               | "+min);
			  System.out.println("|_________________________________________________________________________________________");
    }
    if(max!=Integer.MAX_VALUE){
        
    
               System.out.println("|Max Frequency word is                          | "+max_String);
			   System.out.println("|_________________________________________________________________________________________");
        
              System.out.println("|Its Frequency is                               | "+max);
			  System.out.println("|_________________________________________________________________________________________");
        }}
    private static void getAllFiles(File curDir) {
 
        File[] filesList = curDir.listFiles();
        for(File f : filesList){
           
            if(f.isDirectory())
                getAllFiles(f);
            if(f.isFile()){
               if(f.getName().endsWith(".txt"))
                   
               {             
                   file_List.add(f);
               }else{
                  
               }
            }
        }
      
        
      
        
                    
    
    }

 private static void getWordsFreq(File f) throws FileNotFoundException
 {
   Scanner sc = new Scanner(new FileReader(f));
   
        while (sc.hasNext()) {

            String[] s = sc.next().split("d*[.@:=#-]"); 

            for (int i = 0; i < s.length; i++) {
               
                
                
                String word= s[i].trim();
                
                if(word.length()>=5)
                {
                if(freq_word.get(word)==null)
                {
                    
                    freq_word.put(s[i],1);
                }else
                {
                   freq_word.put(s[i].trim(), freq_word.get(s[i].trim())+1);        
                }
            }   
            }
        }
      
 }
    
   
}
