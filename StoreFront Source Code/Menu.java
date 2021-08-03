package ist242;

import java.util.ArrayList;
import java.util.Collections;

public class Menu {
private ArrayList<String> menu;

public Menu() {
menu = new ArrayList<String>();
}

public void addMenuItem(String item){
menu.add(item);
}

public String getMenuItem(int index){
return menu.get(index);
}

public void updateMenuItem(int index, String item){
menu.set(index, item);
}

public void removeMenuItem(int index){
menu.remove(index);
}

public void clearMenuItems(int index){
menu.clear();
}

public int getNumberMenuItems(){
return menu.size();
}

public void printMenuItems(){
for (String m : menu){
System.out.println(m);
}
}

public void printSortedMenuItems(){
Collections.sort(menu);
for (String m: menu){
System.out.println(m);
}
}
}