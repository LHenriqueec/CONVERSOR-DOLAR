package domain;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Domain {
	
	private DoubleProperty dolar;
	private DoubleProperty real;
	
	public Domain() {
		dolar = new SimpleDoubleProperty();
		real = new SimpleDoubleProperty();
	}
	
	public double getDolar() {
		return this.dolar.get();
	}
	
	public void setDolar(double dolar) {
		this.dolar.set(dolar);
	}
	
	public DoubleProperty dolarProperty() {
		return this.dolar;
	}
	
	public double getReal() {
		return this.real.get();
	}
	
	public void setReal(double real) {
		this.real.set(real);
	}
	
	public DoubleProperty realProperty() {
		return this.real;
	}
}
