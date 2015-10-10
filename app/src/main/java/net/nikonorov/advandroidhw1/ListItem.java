package net.nikonorov.advandroidhw1;

/**
 * Created by vitaly on 10.10.15.
 */
public class ListItem {
    private String caption;
    private String color;

    public String getCaption() {
        return caption;
    }

    public String getColor() {
        return color;
    }

    public ListItem(String caption, String color) {
        this.caption = caption;
        this.color = color;
    }
}
