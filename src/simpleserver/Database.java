package simpleserver;

import com.sun.xml.internal.fastinfoset.util.ValueArrayResourceException;

import java.lang.reflect.Array;
import java.nio.file.FileSystemNotFoundException;
import java.util.*;
import java.lang.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class Database {

    User[] users = null;
    Post[] posts = null;
    private HashMap  <String, User> userHashMap = new HashMap<>();
    private HashMap  <String, Post> postHashMap = new HashMap<>();
    boolean connected = false;
    public static Database db = new Database();

    private Database(){

    }

    public static Database getDatabase(){
        if(!db.connected) db.connect();
        return db;
    }

    public User[] getAllUsers(){
        return this.users;
    }

    public User getUser(int userid){
        if(!userHashMap.containsValue(userid)){
            throw new ValueArrayResourceException();
        }

        User user = userHashMap.get(userid);

        return user;
    }

    public Post getPost(int postid){
        if(!userHashMap.containsValue(postid)){
            throw new ValueArrayResourceException();
        }
        Post post = postHashMap.get(postid);

        return post;
    }



    public Post[] getAllPosts(){
        return this.posts;
    }

    void connect(){
        connected = true;
        Gson gson = new Gson();
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader("src/data.json"));
            JsonParser jsonParser = new JsonParser();
            JsonObject obj = jsonParser.parse(br).getAsJsonObject();

            posts = gson.fromJson(obj.get("posts"), Post[].class);
            users = gson.fromJson(obj.get("users"), User[].class);
            db.populate();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        }



    public void populate(){

        for(int i = 0; i < users.length; i++){
            userHashMap.put( users[i].toString() , users[i]);
        }
        for(int j = 0; j < posts.length; j++){
            postHashMap.put( posts[j].toString(), posts[j]);
        }

    }


    

}


