package in.prestige.json;

import com.google.gson.annotations.SerializedName;

public class Course {
    @SerializedName("name")
    private String mName;
    @SerializedName("description")
    private String Description;

    public Course(String mName, String description) {
        this.mName = mName;
        Description = description;
    }
}
