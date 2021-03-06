package weka.web.data;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class RawAttribute {

	private String attributeName;
	private String attributeType;
	private ArrayList<String> categories;
	
	@JsonCreator
	public RawAttribute(@JsonProperty("attributeName")  String attributeName) {
		this.attributeName = attributeName;
	}
	
	public RawAttribute(String attributeName, String attributeType, ArrayList<String> categories) {
		this.attributeName = attributeName;
		this.attributeType = attributeType;
		this.categories = categories;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public String getAttributeType() {
		return attributeType;
	}
	
	public ArrayList<String> getCategories() {
		return categories;
	}
}
