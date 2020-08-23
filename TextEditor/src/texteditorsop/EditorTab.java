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

    String content = "";

    public EditorTab() {
        System.out.println("-------------------");
        System.out.println("New Mode:");

        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine();

        this.content = content;
    }

    public void edit() {
        System.out.println("-------------------");
        System.out.println("Edit Mode:");

        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine();

        this.content = content;
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
