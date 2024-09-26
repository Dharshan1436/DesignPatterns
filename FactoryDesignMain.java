package designPattrens;
 interface Notification {
	void notifyUser();
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("SMS Notification Sent.");
    }
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Email Notification Sent.");
    }
}
class NotificationFactory {
    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }
        return null;  
    }
}

public class FactoryDesignMain {

	public static void main(String[] args) {
		
	        NotificationFactory factory = new NotificationFactory();
	        
	        Notification notification1 = factory.createNotification("SMS");
	        notification1.notifyUser();  

	        Notification notification2 = factory.createNotification("EMAIL");
	        notification2.notifyUser();  
	    }

	}


