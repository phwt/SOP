/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditorsop;

/**
 *
 * @author LAB304_41
 */
public class TextEditorSOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TabPool t = TabPool.getInstance();
        
        EditorEmpty e1 = new EditorEmpty();
        EditorEmpty e2 = new EditorEmpty();
        t.add(e1);
        t.add(e2);
        
        System.out.println(t.listTab());
        
        TabPool t2 = TabPool.getInstance();
        EditorEmpty e3 = new EditorEmpty();
        t.add(e3);

        System.out.println(t.listTab());
        
        e3.edit();
        System.out.println(t.listTab());
        
        EditorJS ejs = new EditorJS();
        t2.add((EditorJS) ejs.clone());
        
        System.out.println(t2.listTab());
        
        ejs.edit();
        
        System.out.println(t2.listTab());
        
//        EditorEmpty t1 = new EditorEmpty();
//        EditorEmpty t2 = new EditorEmpty();
//        TabPool t = TabPool.getInstance();
//        t.add(t1);
//        t.add(t2);
//        System.out.println(t.listTab());
//        
//        TabPool tab2 = TabPool.getInstance();
//        EditorEmpty t3 = new EditorEmpty();
//        tab2.add(t3);
//        
//        System.out.println(t.listTab());
//        System.out.println(tab2.listTab());
//        
//        t1.edit();
//        System.out.println(tab2.listTab());
//        
//        EditorJS ejs = new EditorJS();
//        tab2.add((EditorJS) ejs.clone());
//        
//        System.out.println(tab2.listTab());
    }
    
}
