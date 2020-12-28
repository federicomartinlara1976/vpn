package net.bounceme.chronos.vpn.client;

public interface ClientInterface {

	// boolean return type signifies if call succeeded in performing expected work.
	boolean startClient(String host, int port, String sharedKey); // Start client and do handshake. Expected call
																	// GUIInterface.connectionReady()

	void endConnection(); // End connection

	boolean sendMessage(String s); // sends a message

	void receiveMessages(); // infinite blocking loop for receiving messages
}
