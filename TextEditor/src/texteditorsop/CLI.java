/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditorsop;

/**
 *
 * @author phwt
 */
public class CLI {

    public static void receiveCommand(String commandSet) {
        String[] commands = commandSet.split(" ");
        String command = commands[0];
        String arg1 = "", arg2 = "";
        if (commands.length >= 2) {
            arg1 = commands[1];
        }
        if (commands.length >= 3) {
            arg2 = commands[2];
        }

        switch (command) {
            case "new":
                if (arg2.isBlank() || arg2.isEmpty()) {
                    EditorFacade.newTab(arg1);
                } else {
                    EditorFacade.newTab(arg1, arg2);
                }
                break;
            case "list":
                EditorFacade.listTab();
                break;
            case "edit":
                EditorFacade.editTab(Integer.parseInt(arg1));
                break;
            case "view":
                EditorFacade.viewTab(Integer.parseInt(arg1));
                break;
            default:
                System.out.println("Invalid Command: " + command);
                break;
        }
    }
}
