package designpattern.iteratorpattern.restaurantMenu;

import java.util.Calendar;
import java.util.Iterator;

/**
 * 午餐的菜单项能交替改变，周一、周三、周五、周六提供一些项，其他天提供另一些项。
 */
public class AlternatingDinerMenuIterator
        implements Iterator {
    private MenuItem[] items;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
