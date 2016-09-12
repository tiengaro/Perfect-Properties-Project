package perfectproperties.vn.perfectpropertiesproject.Entity;

import java.io.Serializable;

/**
 * Created by DungNguyen on 9/9/16.
 */
public class NewsListData implements Serializable {

    String Description;
    String title;
    int imgResId;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }

}
