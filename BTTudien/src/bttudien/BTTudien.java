/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttudien;

import java.util.*;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author thang
 */
public class BTTudien {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
       
       Dictionary.store.put("thang", "thanh");
       DictionaryManagement DicMan=new DictionaryManagement();
       DicMan.insert("hai", "ngo");
       System.out.println(Dictionary.store.get("hi"));
       DictionaryCommandline cml = new DictionaryCommandline();
       DicMan.insertFromFile();
       
       
      
       cml.showAllWords();
       DicMan.remove("tng");
       
       cml.showAllWords();
       
      
       
       
       
       
      
    }
    
}
