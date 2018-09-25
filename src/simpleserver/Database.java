package simpleserver;

import java.util.*;

public class Database {

    Set<Object> db = new HashSet<>();


    public void populate(Object[] objArr){      //temporary method just using as a placeholder

        for(int i = 0; i < objArr.length; i++)
        db.add(objArr[i]);

    }

    public Object findValue(String value) {                  //placeholder method for finding and printing values for a "/user" or key along those lines

        Iterator<Object> it = db.iterator();

        while(it.hasNext()){

            if(it.toString()== value){
               break;
            }

        }
        
            return it;
    }

}


