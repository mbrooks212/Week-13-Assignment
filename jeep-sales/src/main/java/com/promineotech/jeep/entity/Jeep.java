package com.promineotech.jeep.entity;

import java.math.BigDecimal;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jeep {

	
	
	  private Long modelPK;
	  private JeepModel modelId;
	  private String trimLevel;
	  private int numDoors;
	  private int wheelSize;
	  private BigDecimal basePrice;

}
