package de.unistuttgart.iste.sqa.pse.sheet07.presence.immutable;

/**
 * Class representing an address, do NOT modify!
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Address {
	private String streetname;
	private int streetnumber;
	private String postalcode;
	private String cityname;

	/**
	 * Create a new instance of {@link Address}
	 * 
	 * @param streetname Must not be {@code null} or blank
	 * @param streetnumber Must be greater than 0.
	 * @param postalcode Must not be {@code null} or blank
	 * @param cityname Must not be {@code null} or blank
	 */
	public Address(final String streetname, final int streetnumber, final String postalcode, final String cityname) {
		if (streetname == null || streetname.isBlank() || streetnumber <= 0 || postalcode == null || postalcode.isBlank() || cityname == null || cityname.isBlank()) {
			throw new IllegalArgumentException("One of the given arguments vioaltes the preconditions.");
		}
		this.streetname = streetname;
		this.streetnumber = streetnumber;
		this.postalcode = postalcode;
		this.cityname = cityname;
	}

	/**
	 * 
	 * @return streetname of the address
	 */
	public String getStreetname() {
		return streetname;
	}

	/**
	 * 
	 * @param streetname Must not be {@code null} or blank.
	 */
	public void setStreetname(final String streetname) {
		if (streetname == null || streetname.isBlank()) {
			throw new IllegalArgumentException("Postalcode is null, but must not be.");
		}
		this.streetname = streetname;
	}

	/**
	 * 
	 * @return streetnumber of the address
	 */
	public int getStreetnumber() {
		return streetnumber;
	}

	/**
	 * 
	 * @param streetnumber Must be greater than 0.
	 */
	public void setStreetnumber(final int streetnumber) {
		if (streetnumber <= 0) {
			throw new IllegalArgumentException("Streetnumber is less or equal than zero, but must not be.");
		}
		this.streetnumber = streetnumber;
	}

	/**
	 * 
	 * @return postalcode of the address.
	 */
	public String getPostalcode() {
		return postalcode;
	}

	/**
	 * 
	 * @param postalcode Must not be {@code null} or blank.
	 */
	public void setPostalcode(final String postalcode) {
		if (postalcode == null || postalcode.isBlank()) {
			throw new IllegalArgumentException("Postalcode is null, but must not be.");
		}
		this.postalcode = postalcode;
	}

	/**
	 * 
	 * @return cityname of the address
	 */
	public String getCityname() {
		return cityname;
	}

	/**
	 * 
	 * @param cityname Must not be {@code null} or blank.
	 */
	public void setCityname(final String cityname) {
		if (cityname == null || cityname.isBlank()) {
			throw new IllegalArgumentException("Cityname is null, but must not be.");
		}
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "Address [streetname=" + streetname + ", streetnumber=" + streetnumber + ", postalcode=" + postalcode
				+ ", cityname=" + cityname + "]";
	}
}
