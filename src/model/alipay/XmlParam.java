package model.alipay;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

//@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
@XmlRootElement(name="param")
public class XmlParam
{
    private String name;
    private String value;
    
    public String getName() {
        return name;
    }
    @XmlAttribute(name="name")
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    @XmlValue
    public void setValue(String value) {
        this.value = value;
    }
    
	@Override
	public String toString() {
		return "XmlParam [name=" + name + ", value=" + value + "]";
	}
	/*
      <param name="trade_no">2015031124200354</param>
	 */
}

