package modelo;

public abstract class Mercancia {

	protected String idMercancia;

	public Mercancia(String idMercancia)throws Exception {
		super();
		try {
		setCodMercancia(idMercancia);
		}catch (Exception e) {
			System.out.println("Error, el id debe ser de 7 dígitos");
		}
	}

	public String getIdMercancia() {
		return idMercancia;
	}

	public void setCodMercancia(String codMercancia) throws Exception {
		if (codMercancia.length()==7){
			this.idMercancia = codMercancia;
		}
		else {
			throw new Exception("Largo Incorrecto");
			}
	}

	@Override
	public String toString() {
		return "Mercancia [idMercancia=" + idMercancia + "]";
	}

	public abstract double calcularPrecioFinal();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMercancia == null) ? 0 : idMercancia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mercancia other = (Mercancia) obj;
		if (idMercancia == null) {
			if (other.idMercancia != null)
				return false;
		} else if (!idMercancia.equals(other.idMercancia))
			return false;
		return true;
	}
	
}
