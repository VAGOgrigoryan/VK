package ru.netology.domain;

public class Post {
    private int id;
    private int dateOfPlacement;
    private String postTitle;
    private String postText;
    public Comments comments;
    private Likes likes;
    private Reposts reposts;
    private int idOwner;
    private int idFrom;
    private int byCreate;
    private int idReplyOwner;
    private int idReplyPost;
    private int onlyFriends;
    private String copyright;
    private ViewsInfo viewsInfo;
    private String typePost;
    private PostSource postSource;
    private Geo geo;
    private int idSigner;
    private boolean canFix;
    private boolean canDelete;
    private boolean canEdit;
    private boolean canCopy;
    private int isPinned;
    private int idOwnerGive;
    private int idOwnerLike;
    private int markedAsAds;
    private boolean isFavorite;
    private int idPostponed;


}
