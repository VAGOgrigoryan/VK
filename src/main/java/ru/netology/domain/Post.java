package ru.netology.domain;

public class Post {
    public int id;
    public int dateOfPlacement;
    public int numberOfViews;
    public String postTitle;
    public String postText;
    public String imageURL;
    public Comments comments;
    public Likes likes;
    public Reposts reposts;

}
