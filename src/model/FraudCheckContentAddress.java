package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = "Models.fraudcheck.FraudCheckContent")
@XmlType(propOrder = { "firstName", "lastName", "addr1","addr2","addr3"
		,"addrCity","addrCountry","addrState","addrPostal","addrZip"})
public class FraudCheckContentAddress {
	private String firstName;
	private String lastName;
	private String addr1;
	private String addr2;
	private String addr3;
	private String addrCity;
	private String addrCountry;
	private String addrState;
	private String addrPostal;
	private String addrZip;
	public FraudCheckContentAddress() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	@XmlElement(name = "FIRST-NAME")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@XmlElement(name = "LAST-NAME")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddr1() {
		return addr1;
	}
	@XmlElement(name = "ADDR_1")
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	@XmlElement(name = "ADDR_2")
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getAddr3() {
		return addr3;
	}
	@XmlElement(name = "ADDR_3")
	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}
	public String getAddrCity() {
		return addrCity;
	}
	@XmlElement(name = "ADDR_CITY")
	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}
	public String getAddrCountry() {
		return addrCountry;
	}
	@XmlElement(name = "ADDR_COUNTRY")
	public void setAddrCountry(String addrCountry) {
		this.addrCountry = addrCountry;
	}
	public String getAddrState() {
		return addrState;
	}
	@XmlElement(name = "ADDR_STATE")
	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}
	public String getAddrPostal() {
		return addrPostal;
	}
	@XmlElement(name = "ADDR_POSTAL")
	public void setAddrPostal(String addrPostal) {
		this.addrPostal = addrPostal;
	}
	public String getAddrZip() {
		return addrZip;
	}
	@XmlElement(name = "ADDR_ZIP")
	public void setAddrZip(String addrZip) {
		this.addrZip = addrZip;
	}
	@Override
	public String toString() {
		return "Address [firstName=" + firstName + ", lastName=" + lastName
				+ ", addr1=" + addr1 + ", addr2=" + addr2 + ", addr3=" + addr3
				+ ", addrCity=" + addrCity + ", addrCountry=" + addrCountry
				+ ", addrState=" + addrState + ", addrPostal=" + addrPostal
				+ ", addrZip=" + addrZip + "]";
	}
	
}
