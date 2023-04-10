package biblioteca;

public class Libro {

	private String titulo;
	private String autor;
	private int codigo;
	private String genero;
	private boolean estado;
	
	
	/**
	 * @param codigo
	 * @param titulo
	 * @param genero
	 * @param autor
	 */
	
	public Libro(int codigo,String titulo,String genero,String autor) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
		this.estado = true;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
