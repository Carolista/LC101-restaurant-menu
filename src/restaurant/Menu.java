package restaurant;

import java.util.ArrayList;

public class Menu {

    private String lastUpdated; // we haven't learned about 'Date' data type yet
    private ArrayList<MenuItem> menuList = new ArrayList<>();

    public Menu(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        this.menuList = menuList;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<MenuItem> menuList) {
        this.menuList = menuList;
    }

    // create specific menu items using MenuItem class

    // create method to add new items to menu list and mark 'isNew' as true

    // create method to loop through all items in menu list to
    // change 'isNew' to false IF a certain amount of time has passed
    // based on date added

}
