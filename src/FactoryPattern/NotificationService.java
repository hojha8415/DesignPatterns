package FactoryPattern;

public class NotificationService {
    public static void main(String[]args){
        NotificationFactory nf = new NotificationFactory();
        Notification notification = nf.createNotification("EMAIL");
        notification.notifyUser();
        notification = nf.createNotification("SMS");
        notification.notifyUser();
        notification = nf.createNotification("PUSH");
        notification.notifyUser();
        notification = nf.createNotification("CALL");
        notification.notifyUser();
    }
}
