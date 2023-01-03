package mqmsgapppackage;
import javax.jms.JMSException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;

@SuppressWarnings("unused")
// Later remove this and remove unused classes, and confirm all still works OK.

public class MQMessagingApp
{
  public static void main(String[] args) throws JMSException {
	  
	  System.out.println("MQMessagingApp launched OK.");
	  
//	  Instantiate the userGUI class.
	  JFrame frame = new JFrame ("UserGUI");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	  
//	  Call the userGUI class.
      frame.getContentPane().add (new UserGUI());
      frame.pack();
      frame.setVisible (true);
      
      
  }
  
  

}

