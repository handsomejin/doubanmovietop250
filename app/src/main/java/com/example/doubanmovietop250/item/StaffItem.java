package com.example.doubanmovietop250.item;

// 显示影人列表的recyclerview的adapter对应的实体类
public class StaffItem {
    private String name;
    private String imageUrl;
    private String id;

    public StaffItem(String name, String imageUrl, String id) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getId() {
        return id;
    }
}
