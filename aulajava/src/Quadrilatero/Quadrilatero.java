package Quadrilatero;

public class Quadrilatero {
	private double lado1, lado2, lado3, lado4, area, perimetro;
	
	public double getLado1(){
		return lado1;
	}
	public double getLado2(){
		return lado2;
	}
	public double getLado3(){
		return lado3;
	}
	public double getLado4(){
		return lado4;
	}
	public double getArea(){
		return area;
	}
	public double getPerimetro(){
		return perimetro;
	}
		
	public void setLado1(double lado){
		this.lado1 = lado;
	}
	public void setLado2(double lado){
		this.lado2 = lado;
	}
	public void setLado3(double lado){
		this.lado3 = lado;
	}
	public void setLado4(double lado){
		this.lado4 = lado;
	}
	
		public void lados(double lado){
		this.lado1 = lado;
		this.lado2 = lado;
		this.lado3 = lado;
		this.lado4 = lado;
		
		this.area = lado * lado;
		this.perimetro = lado + lado + lado + lado;
	}
	public void lados(double ladoMaior, double ladoMenor){
		this.lado1 = ladoMaior;
		this.lado2 = ladoMenor;
		this.lado3 = ladoMaior;
		this.lado4 = ladoMenor;
		
		this.area = ladoMaior * ladoMenor;
		this.perimetro = ladoMaior + ladoMenor + ladoMaior + ladoMenor;
	}
	public void lados(double lado1, double lado2, double baseMenor, double baseMaior, double altura){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = baseMenor;
		this.lado4 = baseMaior;
		
		this.area = ((baseMaior+baseMenor)*altura)/2;
		this.perimetro = lado1 + lado2 + baseMenor + baseMaior;
	}
}

