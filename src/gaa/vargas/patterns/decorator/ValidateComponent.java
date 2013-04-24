package gaa.vargas.patterns.decorator;

public abstract class ValidateComponent {
	
	private String wrapdecorators = "Component ";
	
	
	public String getWrapdecorators() {
		return wrapdecorators;
	}

	public void setWrapdecorators(String wrapdecorators) {
		this.wrapdecorators = wrapdecorators;
	}





	public abstract String validation(String value,ValidateMessage message);

	
	
	

}
