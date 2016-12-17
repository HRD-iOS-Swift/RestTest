package service;

import java.util.List;

import org.apache.tomcat.jni.File;

import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;

import javapns.Push;
import javapns.devices.Device;
import javapns.notification.Payload;
import javapns.notification.PushNotificationManager;
import javapns.notification.*;
import javapns.notification.PushNotificationPayload;
import javapns.notification.PushedNotification;
import sun.net.www.content.text.plain;
import javapns.data.PayLoad;

public class ApnManager {

	
	 /** APNs Server Host **/
    private static final String HOST = "gateway.sandbox.push.apple.com";

    /** APNs Port */
    private static final int PORT = 2195;

    public void sendNotification(String deviceToken) throws Exception {
    	ApnsService service =
    		     APNS.newService()
    		     .withCert("/Users/Teckchun/Documents/workspace/RestTest/WebContent/cert.p12", "")
    		     .withSandboxDestination() // or .withProductionDestination()
    		     .build();

    		String payload =
    		    APNS.newPayload()
    		    .alertBody("My message!")
    		    .badge(45)
    		    .sound("default")
    		    .build();

    		String deviceToken1 = "1f44306acd287d23cbe24811a33fd9eefe979521127bf177b6dbff9a464f3e1e";

    	//	log.warn("Sending push notification...");
    		service.push(deviceToken1, payload);    	
    	
    	
    	
        
}
}