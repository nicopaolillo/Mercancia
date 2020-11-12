package modelo;

public class Producto extends Mercancia {

	private String producto;
	private double precioProducto;
	private double porcentajeDescuento;
	private boolean esDescuentoEnSegundaUnidad;

	public Producto(String idMercancia, String producto, double precioProducto, double porcentajeDescuento,
			boolean esDescuentoEnSegundaUnidad) throws Exception {
		super(idMercancia);
		this.producto = producto;
		this.precioProducto = precioProducto;
		this.porcentajeDescuento = porcentajeDescuento;
		this.esDescuentoEnSegundaUnidad = esDescuentoEnSegundaUnidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public boolean getEsDescuentoEnSegundaUnidad() {
		return esDescuentoEnSegundaUnidad;
	}

	public void setEsDescuentoEnSegundaUnidad(boolean esDescuentoEnSegundaUnidad) {
		this.esDescuentoEnSegundaUnidad = esDescuentoEnSegundaUnidad;
	}

	@Override
	public String toString() {
		return "Producto [producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDescuento="
				+ porcentajeDescuento + ", esDescuentoEnSegundaUnidad=" + esDescuentoEnSegundaUnidad + "]";
	}

	@Override
	public double calcularPrecioFinal() {
		if (esDescuentoEnSegundaUnidad) {
			porcentajeDescuento = porcentajeDescuento / 2;
			precioProducto = precioProducto * porcentajeDescuento / 100;
		}
		return precioProducto;
	}

}
