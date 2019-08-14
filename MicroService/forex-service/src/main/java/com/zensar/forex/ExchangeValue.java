package com.zensar.forex;
 
import java.math.BigDecimal;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
public class ExchangeValue {
 
	@Id
	private long id;
 
	@Column(name = "currency_from")
	private String from;
 
	@Column(name = "currency_to")
	private String to;
 
	private BigDecimal conversionMultiple;
	private int port;
 
 
	public ExchangeValue() {
		// TODO Auto-generated constructor stub
	}
 
 
	public ExchangeValue(long id, String from, String to, BigDecimal conversionMultiple, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
	}
 
 
	public long getId() {
		return id;
	}
 
 
	public void setId(long id) {
		this.id = id;
	}
 
 
	public String getFrom() {
		return from;
	}
 
 
	public void setFrom(String from) {
		this.from = from;
	}
 
 
	public String getTo() {
		return to;
	}
 
 
	public void setTo(String to) {
		this.to = to;
	}
 
 
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
 
 
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
 
 
	public int getPort() {
		return port;
	}
 
 
	public void setPort(int port) {
		this.port = port;
	}
 
 
}