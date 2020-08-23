/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditorsop;

import java.util.ArrayList;

/**
 *
 * @author LAB304_41
 */
public class TabPool extends ArrayList<EditorTab>{
    public static TabPool TAB_POOL;
    
    private TabPool() {
    }
    
    public static TabPool getInstance() {
        if (TAB_POOL == null) {
            TAB_POOL = new TabPool();
        }
        return TAB_POOL;
    }
    
    public String listTab() {
        String tabList = "";
   
        for (EditorTab tab: TAB_POOL) {
            tabList += "Tab Number: " + (TAB_POOL.indexOf(tab) + 1) + "\n\t" + tab.content + "\n";
        }

        return tabList;
    }
}
