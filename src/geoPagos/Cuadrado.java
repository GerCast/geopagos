package geoPagos;

public class Cuadrado extends Figura {
	Cuadrado(Integer base, Integer altura) {
		setBase(base);
		setAltura(altura);
		setTipoFigura(tipoFigura.CUADRADO);
	}
	Cuadrado() {
		setBase(0);
		setAltura(0);
		setTipoFigura(tipoFigura.CUADRADO);
	}
	public String dataToString()
	{
		String data = super.dataToString() ;
		data += "Base: " + getBase() + System.lineSeparator() ;
		data += "Altura: " + getAltura() + System.lineSeparator() ;
		data += "Superficie: " + getSuperficie() + System.lineSeparator() ;
		return data;
	}
}
