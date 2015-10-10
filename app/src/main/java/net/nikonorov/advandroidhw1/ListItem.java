package net.nikonorov.advandroidhw1;

/**
 * Created by vitaly on 10.10.15.
 */
public class ListItem {
    private String caption;
    private int color;

    public String getCaption() {
        return caption;
    }

    public int getColor() {
        return color;
    }

    public ListItem(String caption, int color) {
        this.caption = caption;
        this.color = color;
    }
}
