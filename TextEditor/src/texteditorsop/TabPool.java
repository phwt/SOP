package texteditorsop;

import java.util.ArrayList;

public class TabPool extends ArrayList<EditorTab> {

    public static TabPool TAB_POOL;

    // Private constructor - disable object instantination
    private TabPool() {
    }

    /**
     * Return the same object every time this method is called. Will create new
     * if does not exist yet.
     *
     * @return Singleton TabPool
     */
    public static TabPool getInstance() {
        if (TAB_POOL == null) {
            TAB_POOL = new TabPool();
        }
        return TAB_POOL;
    }

    public boolean tabExist(int index) {
        return !(index > this.size());
    }

    /**
     * List all tabs inside the pool.
     *
     * @return A string with each line containing tab index (1-based indexing)
     * and its name
     */
    public String listTab() {
        String tabList = "#\t|\tTab Name\n";

        for (EditorTab tab : TAB_POOL) {
            tabList += (TAB_POOL.indexOf(tab) + 1) + "\t|\t" + tab.name + "\n";
        }

        return tabList;
    }
}
