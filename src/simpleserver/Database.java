package simpleserver;

import java.util.*;
import java.lang.*;

public class Database {

    Map<Class, Object> db =  new HashMap<Class, Object>();


    public void populate(Object[] objArr){      //temporary method just using as a placeholder

        for(int i = 0; i < objArr.length; i++){
            db.put(objArr[i].getClass(), objArr[i]);
        }


    }

    public Object findValue(Class keyValue, Object value) {                  //placeholder method for finding and printing values for a "/user" or key along those lines
        Object temp = new Object();
        for (Object key : db.values()) {

            if (key == value) {
                temp = key;
            }

        }

        return temp;
    }

}


