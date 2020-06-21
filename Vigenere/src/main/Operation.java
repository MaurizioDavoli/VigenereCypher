package main;

import cifrari.CifrarioVigenere;

public class Operation {
	
	private CifrarioVigenere cypher;
	
	public Operation() {
		this.cypher = new CifrarioVigenere();
	}

	public String doSomething(String command,String text,String verme) {

		String toReturn = null;
		if ( command.equals("encrypt") ) {
			toReturn = cypher.encrypt(verme, text);
		}
		else {
			toReturn = cypher.decrypt(verme, text);
		}
		return toReturn;
	}

}
