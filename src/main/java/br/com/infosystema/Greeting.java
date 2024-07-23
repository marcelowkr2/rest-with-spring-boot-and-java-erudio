package br.com.infosystema;

public class Greeting {
	
	private final long id;
	private final String contend;
	
	public Greeting(long id, String contend) {
		this.id = id;
		this.contend = contend;
	}

	public long getId() {
		return id;
	}

	public String getContend() {
		return contend;
	}

	
}
