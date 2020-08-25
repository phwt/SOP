/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditorsop;

import java.util.Scanner;

/**
 *
 * @author LAB304_41
 */
public abstract class EditorTab implements Cloneable {

    String name = "";
    String content = "";

    public EditorTab(String name) {
        this.name = name;
    }
    
    public void view() {
        System.out.println("\n--- Showing content of: " + this.name + " ---");
        System.out.println(this.content);
        System.out.println("--- EOF ---\n");
    }

    public void edit() {
        System.out.println("\n--- Editing: " + this.name + " ---");
        System.out.println("Enter file content below this line:");

        Scanner scanner = new Scanner(System.in);
        this.content = scanner.nextLine();
        System.out.println("--- File: " + this.name + " edited ---\n");
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

}
