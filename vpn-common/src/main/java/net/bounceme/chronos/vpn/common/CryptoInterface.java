package net.bounceme.chronos.vpn.common;

public interface CryptoInterface {

	// boolean return type signifies if call succeeded in performing expected work.

	boolean startServer(int port, String sharedKey); // Start server and wait for client connections

	boolean startClient(String host, int port, String sharedKey); // Start client and do handshake. Expected call
																			// GUIInterface.connectionReady()

	void endConnection(); // End connection

	void closeServer(); // shutdown server

	boolean sendMessage(String s); // sends a message

	void acceptConnection();

	void receiveMessages();
}
