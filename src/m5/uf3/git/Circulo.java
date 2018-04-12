package m5.uf3.git;

public class Circulo {
	
	private int radio;
	private double area;
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void calcularArea(){
		setArea(Math.PI * Math.pow(radio,2));
	}

}