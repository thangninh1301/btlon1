/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttudien;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;



/**
 *
 * @author thang
 */
public class DictionaryManagement {
       
 
    public String insertWord(){
        Scanner scanIn=new Scanner(System.in); 
        String target = ""; 
        target = scanIn.nextLine(); 
        return target;
    }
    public void insertFromCommandline()
    {
         System.out.println("nhap tu TA truoc TV sau ");
         DictionaryManagement dm = new DictionaryManagement();
         Dictionary.store.put(dm.insertWord(),dm.insertWord());
         
    }
    
    public void insert(String target,String explain)
    {
         Dictionary.store.put(target, explain);
    }

    public void insertFromFile(){
         BufferedReader br = null;
         DictionaryManagement dm =new DictionaryManagement();
        try {   
            br = new BufferedReader(new FileReader("output.txt"));       
            int num=0;
            String textInALine;

            while ((textInALine = br.readLine()) != null) {
                
                for (int i=0;i<textInALine.length();i++){
                    if('|'==textInALine.charAt(i)){
                        dm.insert(textInALine.substring(0,i), textInALine.substring(i+1));
                    } 
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
    }
    public void exportToFile(){
        DictionaryManagement dm=new DictionaryManagement();
        BufferedWriter br = null;
         try {   
               
        br = new BufferedWriter(new FileWriter("output.txt"));  
        Set<String> keySet=Dictionary.store.keySet();
        for (String i:keySet) {
            br.write(i+"|"+Dictionary.store.get(i));
            br.newLine();
        }
        br.close();
        System.out.println("Success...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public String dictionaryLookup(String key){
        String temp=Dictionary.store.get(key);
        if (temp==null) return "LOI: Chua co tu nay";
        return temp;
    }
    public void remove(String key){
        Dictionary.store.remove(key);
    }
    public void replace(String key,String newVal){
        if(Dictionary.store.get(key)==null){
            System.out.println("ko co tu nay");
            return;
        }            
        Dictionary.store.replace(key,newVal);
    }
    
    
    
    
}
