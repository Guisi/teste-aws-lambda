package com.guisi.teste.awslambda;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Entity {

	private String campo1;
	private BigDecimal campo2;

	public Entity() {
	}

	public Entity(String campo1, BigDecimal campo2) {
		super();
		this.campo1 = campo1;
		this.campo2 = campo2;
	}

	public String getCampo1() {
		return campo1;
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	public BigDecimal getCampo2() {
		return campo2;
	}

	public void setCampo2(BigDecimal campo2) {
		this.campo2 = campo2;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

}
