package M5_REST_API.Task6;

import lombok.Data;

@Data
public class Tag{
    public int id;
    public String name;

    public Tag(int id, String name){
        this.id = id;
        this.name = name;
    }
}
