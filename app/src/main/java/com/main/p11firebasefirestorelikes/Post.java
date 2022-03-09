package com.main.p11firebasefirestorelikes;

import java.util.*;


public class Post {
    public String uid;
    public String author;
    public String authorPhotoUrl;
    public String content;
    //2.Gestió de Likes
    public Map<String, Boolean> likes = new HashMap<>();

    // Constructor vacio requerido por Firestore
    public Post() {}

    public Post(String uid, String author, String authorPhotoUrl, String content) {
        this.uid = uid;
        this.author = author;
        this.authorPhotoUrl = authorPhotoUrl;
        this.content = content;
    }
}