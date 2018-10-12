package simpleserver;

public class Response {
    public String status;
    public int entries;
    iData[] data;
    

    public void setStatus(String status){
        this.status = status;
    }

    public void setPostData(Post[] data) {
        this.entries = data.length;
        this.data = data;
    }

    public void setPostData(Post data) {
        this.data[0] = data;
    }


    public void setUserData(User[] data) {
        this.entries = data.length;
        this.data = data;
    }

    public void setUserData(User data) {

        this.data[0] = data;
    }


}
