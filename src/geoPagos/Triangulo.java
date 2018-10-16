package geoPagos;

public class Triangulo extends Figura {
	Triangulo(Integer base, Integer altura) {
		setBase(base);
		setAltura(altura);
		setTipoFigura(tipoFigura.TRIANGULO);
	}
	Triangulo() {
		setBase(0);
		setAltura(0);
		setTipoFigura(tipoFigura.TRIANGULO);
	}
	
	@Override
	public Double getSuperficie() {
		return (double)(getBase() * getAltura())/2;
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
