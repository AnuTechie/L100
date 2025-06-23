package notificationFactory.notifications;

public class PushNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("🔔 Push notification sent: " + message);
    }
}
