package M5_REST_API.Task6;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Root {
    private int id;
    private Category category;
    private String name;
    private ArrayList<String> photoUrls;
    private ArrayList<Tag> tags;
    private String status;

    public void setPhotoUrls() {
        photoUrls = new ArrayList<>();
        photoUrls.add("sai");
//        photoUrls.add("jrv");
//        photoUrls.add("sai");
    }




}

