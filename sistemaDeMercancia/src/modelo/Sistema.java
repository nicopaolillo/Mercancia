package modelo;

import java.util.*;

public class Sistema {

	private List<Mercancia> lstMercancia;

	public Sistema() {
		this.lstMercancia = new ArrayList<Mercancia>();
	}

	public List<Mercancia> getLstMercancia() {
		return lstMercancia;
	}

	public void setLstMercancia(List<Mercancia> lstMercancia) {
		this.lstMercancia = lstMercancia;
	}

	@Override
	public String toString() {
		return "lista de mercancia:" + lstMercancia;
	}

	public boolean agregarProducto(String codMercancia, String producto, double precioProducto,
			double porcentajeDescuento, boolean esDescuentoEn2daUnidad) throws Exception {
		Producto product = new Producto(codMercancia, producto, precioProducto, porcentajeDescuento,
				esDescuentoEn2daUnidad);
		try {
			for (Mercancia mer : lstMercancia) {
				if (product.equals(mer))
					throw new Exception("Error, mercancia repetida");
			}
		} catch (Exception e) {
			System.out.println("\"Error, mercancia repetida\"");
		}
		return lstMercancia.add(product);
	}

	public boolean agregarServicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento,
			boolean enPromocion) throws Exception {
		Servicio serv = new Servicio(codMercancia, servicio, presupuesto, porcentajeDescuento, enPromocion);
		try {
			for (Mercancia mer : lstMercancia) {
				if (serv.equals(mer))
					throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Error, mercancia repetida");
		}
		return lstMercancia.add(serv);
	}

	public Mercancia traerMercancia(String codMercancia) {
		Mercancia m1 = null;

		for (Mercancia mercancia : this.lstMercancia) {
			if (mercancia.getIdMercancia() == codMercancia) {
				m1 = mercancia;
			}
		}
		return m1;
	}

//	public List<Mercancia> traerMercancia(boolean enPromocion) {
//
//		List<Mercancia> mercanciaList = new ArrayList<Mercancia>();
//		for (Mercancia mercancia : this.lstMercancia) {
//			if (mercancia instanceof Producto) {
//				Producto pAux = (Producto) mercancia; // Castea como a producto
//				if (enPromocion == pAux.isEsDescuentoEn2daUnidad()) {
//					mercanciaList.add(pAux);
//				}
//			}
//			if (mercancia instanceof Servicio) {
//				Servicio pAux2 = (Servicio) mercancia; // Castea como a producto
//				if (enPromocion == pAux2.isEnPromocion()) {
//					mercanciaList.add(pAux2);
//				}
//			}
//		}
//		return mercanciaList;
//	}
}
