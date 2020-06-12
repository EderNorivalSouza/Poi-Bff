package model;

public class Poi {
	

	private Long id;
	private String name;
	private Integer coordX;
	private Integer coordY;
	
	public Poi() {
	}

	public Poi(String name, Integer coordX, Integer coordY) {
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

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Poi{" +
				"id=" + id +
				", name='" + name + '\'' +
				", coordX=" + coordX +
				", coordY=" + coordY +
				'}';
	}
}
