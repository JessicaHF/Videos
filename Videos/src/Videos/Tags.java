package Videos;
public class Tags {

	private String name;// variable de clase

//CONSTRUCTOR	
	/*
	 * String name = variable de metodo o función.
	 */
	public Tags(String name) throws Exception {
		if (name == null)
			throw new Exception();
		this.name = name; // -> this para pasar el nombre del tag. No es necesario cuando hay constructor
							// vacío.
	}

	public Tags() {

	}

//METODOS DE TAGS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
