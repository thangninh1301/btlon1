/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttudien;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author thang
 */
public class DictionaryCommandline {
    
    
    public void showAllWords(){
        
        Set<String> keySet=Dictionary.store.keySet();
        for (String i:keySet) System.out.println(i+"|"+Dictionary.store.get(i));
    }
    public void dictionaryBasic() {
        DictionaryCommandline dc=new DictionaryCommandline();
        DictionaryManagement  dm=new DictionaryManagement();
        dc.showAllWords();
        dm.insertFromCommandline();
    }
   
}
