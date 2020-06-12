package model;

public class PoiFilterDto {
	

	Integer dmax;
	Integer coordX;
	Integer coordY;
	
	
	public PoiFilterDto(Integer coordX, Integer coordY, Integer dmax) {
		this.dmax = dmax;
		this.coordX = coordX;
		this.coordY = coordY;
	}


	public Integer getDmax() {
		return dmax;
	}


	public Integer getCoordX() {
		return coordX;
	}


	public Integer getCoordY() {
		return coordY;
	}
	
	

}
