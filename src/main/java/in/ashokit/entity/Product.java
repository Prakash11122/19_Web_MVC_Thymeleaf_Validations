package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	
	private Integer pid;
	
	@NotBlank(message="Name is mandatory")
	@Size(min=3, max=15, message="Name should have only 3 to 15 characters ")
	private String name;
	
	@NotNull(message="Price is mandatory")
	@Positive(message="Price should be positive number")
	private Double price;
	
	@NotNull(message="Quantity is mandatory")
	@Positive(message="Quantity should be positive number")
	private Integer qty;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	

}
