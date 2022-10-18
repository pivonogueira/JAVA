package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ex19Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<ex19Installment> intalmments = new ArrayList<>();
	
	public ex19Contract() {
	}

	public ex19Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<ex19Installment> getIntalmments() {
		return intalmments;
	}




	
}
