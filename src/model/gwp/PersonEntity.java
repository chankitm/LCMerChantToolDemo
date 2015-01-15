package model.gwp;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="Person")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonEntity {

    @XmlAttribute
    private String name;

    @XmlAttribute
    private int age;

	@Override
	public String toString() {
		return "PersonEntity [name=" + name + ", age=" + age + "]";
	}
    
    
}
