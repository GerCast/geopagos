package geoPagos;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura f = FiguraFactory.getFigura(Figura.tipoFigura.CIRCULO);
		f.setRadio(3);
		System.out.print(f.dataToString() + System.lineSeparator());
		
		Figura f2 = FiguraFactory.getFigura(Figura.tipoFigura.CUADRADO);
		f2.setBase(3);
		f2.setAltura(4);
		System.out.print(f2.dataToString() + System.lineSeparator());
		
		Figura f3 = FiguraFactory.getFigura(Figura.tipoFigura.TRIANGULO);
		f3.setBase(3);
		f3.setAltura(4);
		System.out.print(f3.dataToString() + System.lineSeparator());

	}

}
