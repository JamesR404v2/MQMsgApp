package mqmsgapppackage;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

//import org.slf4j.impl.StaticLoggerBinder;

//import org.apache.activemq.artemis.api.jms.ActiveMQJMSClient;
// added above import line as part of troubleshooting, simple because I see it in a lot of samples that use ActiveMQConnectionFactory.
// such as 
//C:\Dropbox\Appz\ActiveMQ Artemis\apache-artemis-2.27.1\examples\features\clustered\queue-message-redistribution\src\main\java\org\apache\activemq\artemis\jms\example\QueueMessageRedistributionExample.java
// but it made no difference. Nonetheless leaving it here and I can try removing it after teh code is working.

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

public class QueueWriter {


	
		void queueWriter() throws JMSException {

		System.out.println("MQ Messaging App launched OK");
		  
	    // Create a connection factory
	    ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");

	    // Create a connection
	    Connection connection = factory.createConnection();

	    // Start the connection
	    connection.start();

	    // Create a session
	    Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

	    // Create a queue
	    Destination queue = session.createQueue("testQueue");

	    // Create a message producer
	    MessageProducer producer = session.createProducer(queue);

	    // Create a message
	    TextMessage message = session.createTextMessage("Hello, World!");

	    // Send the message
	    producer.send(message);

	    // Close the connection
	    connection.close();
	    
	    // Close the factory
//	    factory.close();
//	    That method isn't supported.
//	    two links that appear relevant but are some work to grock; 
//	    https://stackoverflow.com/questions/13296655/where-should-i-close-my-activemq-connection-java-jersey
//	    	https://www.tabnine.com/code/java/methods/org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory/close
//	    		Read up how to close a Artemis JMS client should close its ActiveMQConnectionFactory 
//	    		https://www.rememberthemilk.com/app/#list/49260999/925119318
		}
}
