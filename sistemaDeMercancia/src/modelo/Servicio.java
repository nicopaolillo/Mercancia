package modelo;

public class Servicio extends Mercancia {

	private String servicio;
	private double presupuesto;
	private double porcentajeDescuento;
	private boolean enPromocion;

	public Servicio(String idMercancia, String servicio, double presupuesto, double porcentajeDescuento,
			boolean enPromocion)throws Exception {
		super(idMercancia);
		this.servicio = servicio;
		this.presupuesto = presupuesto;
		this.porcentajeDescuento = porcentajeDescuento;
		this.enPromocion = enPromocion;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public boolean isEnPromocion() {
		return enPromocion;
	}

	public void setEnPromocion(boolean enPromocion) {
		this.enPromocion = enPromocion;
	}

	@Override
	public String toString() {
		return "Servicio [servicio=" + servicio + ", presupuesto=" + presupuesto + ", porcentajeDescuento="
				+ porcentajeDescuento + ", enPromocion=" + enPromocion + "]";
	}

	@Override
	public double calcularPrecioFinal() {
		if (enPromocion) {
			presupuesto = presupuesto * porcentajeDescuento / 100;
		}
		return presupuesto;
	}

}
