package simpleserver;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Database {

    Map<Class, Object> db =  new HashMap<Class, Object>();


    public void populate(Object[] objArr){      //temporary method just using as a placeholder

        for(int i = 0; i < objArr.length; i++){
            db.put(objArr[i].getClass(), objArr[i]);
        }


    }

    public Object[] allUsers(){

        Object user[] = new Object[db.size()];

        Object arr[] = db.values().toArray();
        for (int i = 0; i < arr.length; i++){
            if(arr[i].getClass() == User.class){
                user[i] = arr[i]; ;
            }
        }

        return user;



    };

    public Object[] allPost(){
        Object post[] = new Object[db.size()];

        Object arr[] = db.values().toArray();
        for (int i = 0; i < arr.length; i++){
            if(arr[i].getClass() == Post.class){
                post[i] = arr[i]; ;
            }
        }

        return post;


    };

    public String specPost(Post postid){

    
    }


    public Object findValue(Object value) {                  //placeholder method for finding and printing values for a "/user" or key along those lines
        Object temp = new Object();
        for (Object key : db.values()) {

            if (key == value) {
                temp = key;
            }

        }

        return temp;
    }

}


