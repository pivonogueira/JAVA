package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.ex10OrderStatus;

public class ex10Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private ex10OrderStatus status;

	private ex10Client client;
	private List<ex10OrderItem> items = new ArrayList<ex10OrderItem>();

	// Constructor
	public ex10Order() {
	}

	public ex10Order(Date moment, ex10OrderStatus status, ex10Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	// Get and Set
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public ex10OrderStatus getStatus() {
		return status;
	}

	public void setStatus(ex10OrderStatus status) {
		this.status = status;
	}

	public ex10Client getClient() {
		return client;
	}

	public void setClient(ex10Client client) {
		this.client = client;
	}

	// Methods
	public void addItem(ex10OrderItem item) {
		items.add(item);
	}

	public void removeItem(ex10OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		double sum = 0;
		for (ex10OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (ex10OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
