package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> menuList;

    public Menu(Date lastUpdated, ArrayList<MenuItem> menuList) {
        this.lastUpdated = lastUpdated;
        this.menuList = menuList;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<MenuItem> menuList) {
        this.menuList = menuList;
    }

    // Create method to add new items to menu list and mark 'isNew' as true

    public void addMenuItem(MenuItem item) {
        menuList.add(item);
        // mark isNew as true
    }

    /*
    Create method to loop through all items in menu list to
    change 'isNew' to false IF a certain amount of time has passed
    based on date added
    */

    public void updateMenu(ArrayList<MenuItem> menuList) {
        for (item : menuList) {
            if ( ) { // if dateAdded property of item is more than X days ago
                // change isNew to false
            }
        }
        // change lastUpdated to today's date
    }

}
