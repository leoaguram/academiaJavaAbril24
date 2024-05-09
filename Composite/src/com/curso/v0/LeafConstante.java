package com.curso.v0;

public class LeafConstante implements Component {
	
	private double constante;

	LeafConstante(double constante){
		this.constante = constante;
	}

	@Override
	public double getValor() {
		return constante;
	}

}
