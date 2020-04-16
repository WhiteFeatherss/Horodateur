package Email;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail
{

    public static void SendMail(String Message_Reciever, String Header, String MessageInside) throws Exception
    {
        System.out.println("Preparing to send message.");
        
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String emailUsedToSend = "NetBeansTestProject@gmail.com";
        String passwordforEmail = "Azsx1234";
        
        Session session = Session.getInstance(properties, new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(emailUsedToSend, passwordforEmail);
            }
        }); 
         
        Message message = prepareMessage(session, emailUsedToSend, Message_Reciever, Header, MessageInside);
    
        
        Transport.send(message);
        System.out.println("Message sent successfully") ;
    }

    private static Message prepareMessage(Session session, String emailUsedToSend, String Message_Receiver, String Header, String MessageInside)
    {
        try
        {
            Message message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(emailUsedToSend));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(Message_Receiver));
            message.setSubject(Header);
            message.setText(MessageInside);
            
            return message;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
}
