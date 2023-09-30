package SingletonPattern;

public class DBConnection {
    String url;
    String username;
    String password;
    String tcpConnection;
    private static DBConnection inst;
    private DBConnection(String url, String username, String password, String tcpConnection) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.tcpConnection = tcpConnection;
    }
    public static DBConnection getInstance(){
        if(inst == null){
            inst = new DBConnection("","","","");
        }
        return inst;
    }
}

