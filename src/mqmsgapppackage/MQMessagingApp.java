package mqmsgapppackage;
import javax.jms.JMSException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MQMessagingApp
{
  public static void main(String[] args) throws JMSException {
	  
//	  Instantiate the userGUI class.
	  UserChoiceMenu userChoiceMenu = new UserChoiceMenu();
	  

	  
	  
//	  Instantiate the QueueWriter class.
	  QueueWriter queueWriterVar = new QueueWriter();
//	  Call the QueueWriter function.
	  queueWriterVar.queueWriter();     
	  
//	  Call the userGUI class.
	  userChoiceMenu.userChoiceMenu();
	  
	  
  }
  
  

// temporarily making this static https://workflowy.com/#/451c594556f0
  public static class UserChoiceMenu extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void userChoiceMenu() {
      // Set the title and size of the frame
      setTitle("User Choice Menu");
      setSize(300, 200);

      // Create a menubar
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);

      // Create a menu
      JMenu menu = new JMenu("Menu");
      menuBar.add(menu);

      // Create menu items
      JMenuItem menuItem1 = new JMenuItem("Option 1");
      JMenuItem menuItem2 = new JMenuItem("Option 2");
      menu.add(menuItem1);
      menu.add(menuItem2);

      // Add action listeners to the menu items
      menuItem1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // Code to be executed when Option 1 is selected
//      	  Instantiate the QueueWriter class.
      	  QueueWriter queueWriterVar = new QueueWriter();
//      	  Call the QueueWriter function.
      	  queueWriterVar.queueWriter();   
        }
      });
      menuItem2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // Code to be executed when Option 2 is selected
        }
      });

      // Set the frame to exit when it is closed
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

//    public void (String[] args) {
//      UserChoiceMenu frame = new UserChoiceMenu();
//      frame.setVisible(true);
//    }
//	later iterations of working with ChatGPT omitted this part... it is also throwing a syntax error.
  }

  
}