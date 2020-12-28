package net.bounceme.chronos.vpn.common;

public interface GUIInterface {
	void printf(String s); // Prints to screen

	void connectionReady(); // Connection is ready for messages

	void connectionClosed(); // Connection is terminated
}