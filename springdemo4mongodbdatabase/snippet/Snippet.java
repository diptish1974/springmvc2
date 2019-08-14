package snippet;

public class Snippet {
	
	com.mongodb.MongoSocketOpenException: Exception opening socket
		at com.mongodb.internal.connection.SocketStream.open(SocketStream.java:67) ~[mongodb-driver-core-3.8.2.jar:na]
		at com.mongodb.internal.connection.InternalStreamConnection.open(InternalStreamConnection.java:126) ~[mongodb-driver-core-3.8.2.jar:na]
		at com.mongodb.internal.connection.DefaultServerMonitor$ServerMonitorRunnable.run(DefaultServerMonitor.java:117) ~[mongodb-driver-core-3.8.2.jar:na]
		at java.lang.Thread.run(Thread.java:748) [na:1.8.0_161]
	Caused by: java.net.ConnectException: Connection refused: connect
		at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method) ~[na:1.8.0_161]
		at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85) ~[na:1.8.0_161]
		at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350) ~[na:1.8.0_161]
		at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206) ~[na:1.8.0_161]
		at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188) ~[na:1.8.0_161]
		at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172) ~[na:1.8.0_161]
		at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:1.8.0_161]
		at java.net.Socket.connect(Socket.java:589) ~[na:1.8.0_161]
		at com.mongodb.internal.connection.SocketStreamHelper.initialize(SocketStreamHelper.java:64) ~[mongodb-driver-core-3.8.2.jar:na]
		at com.mongodb.internal.connection.SocketStream.open(SocketStream.java:62) ~[mongodb-driver-core-3.8.2.jar:na]
		... 3 common frames omitted
	
}

