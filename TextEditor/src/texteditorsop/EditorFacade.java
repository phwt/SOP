/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditorsop;

import java.util.Scanner;

/**
 *
 * @author phwt
 */
public class EditorFacade {

    private static final TabPool TAB_POOL = TabPool.getInstance();
    Scanner scanner = new Scanner(System.in);

    public static void newTab(String name) {
        TAB_POOL.add(new EditorEmpty(name));
    }

    public static void newTab(String name, String template) {
        switch (template) {
            case "JS":
                TAB_POOL.add(new EditorJS(name));
                break;
            case "Java":
                TAB_POOL.add(new EditorJava(name));
                break;
            default:
                System.out.println("Invalid template name: " + template);
                break;
        }
    }

    public static void listTab() {
        System.out.println(TAB_POOL.listTab());
    }

    public static void editTab(int tabIndex) {
        if (TAB_POOL.tabExist(tabIndex)) {
            TAB_POOL.get(tabIndex - 1).edit();
        } else {
            System.out.println("Tab number " + tabIndex + " does not exist!");
        }
    }

    public static void viewTab(int tabIndex) {
        if (TAB_POOL.tabExist(tabIndex)) {
            TAB_POOL.get(tabIndex - 1).view();
        } else {
            System.out.println("Tab number " + tabIndex + " does not exist!");
        }
    }
}
