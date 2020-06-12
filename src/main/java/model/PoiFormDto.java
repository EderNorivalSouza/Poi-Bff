package model;

public class PoiFormDto {
	

	private String name;
	private Integer coordX;
	private Integer coordY;

	public PoiFormDto(String name,Integer coordX, Integer coordY) {
		this.name = name;
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public String getName() {
		return name;
	}

	public Integer getCoordX() {
		return coordX;
	}

	public Integer getCoordY() {
		return coordY;
	}
}
