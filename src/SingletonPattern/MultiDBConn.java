package SingletonPattern;

import java.util.concurrent.locks.ReentrantLock;

public class MultiDBConn { //multithreaded & performance enhanced using 2 if blocks in get instance method
        String url;
        String username;
        String password;
        String tcpConnection;
        private static MultiDBConn inst;
        private static ReentrantLock mutex = new ReentrantLock();
        private MultiDBConn(String url, String username, String password, String tcpConnection) {
            this.url = url;
            this.username = username;
            this.password = password;
            this.tcpConnection = tcpConnection;
        }

        public static MultiDBConn getInstance(){
            if(inst == null){
                mutex.lock();
                    if(inst == null){
                        inst = new MultiDBConn("","","","");
                    }
                mutex.unlock();
            }
            return inst;
        }

}
