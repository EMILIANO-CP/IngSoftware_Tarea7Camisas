package FesAragon.Camisa;

public class camisa {
	private float precio;
	private String manga;
	private String tipo;
	
	public camisa(String manga, String tipo) {
		this.manga = manga;
		this.tipo = tipo;
	}

	public float getPrecio() {
		if(tipo.equals("sin tipo") && manga.equals("corta")) {
			precio = 190.0f;
		} else if (tipo.equals("casual") && manga.equals("larga")) {
			precio = 230.0f;
		} else if (tipo.equals("formal") && manga.equals("larga")) {
			precio = 310.0f;
		}
		return precio;
	}

	public String getManga() {
		return manga;
	}

	public void setManga(String manga) {
		this.manga = manga;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}