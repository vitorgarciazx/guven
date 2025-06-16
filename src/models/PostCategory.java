package src.models;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class PostCategory {
    private UUID id;
    private String name;
    private String description;
    private Date createdAt;
    private HashMap<UUID, String> posts = new HashMap<UUID, String>();
}
