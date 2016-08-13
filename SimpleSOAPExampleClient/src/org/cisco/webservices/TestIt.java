package org.cisco.webservices;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TestIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldServiceLocator service = new HelloWorldServiceLocator();
		try {
			service.getHelloWorld().sayHelloWorld("Sumit");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

}
