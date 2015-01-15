package model;

import java.util.List;

public class ColorSwatch extends BaseModel{
	private String id;
    private String displayName;
    private String projectId;
    private List<Translation> translations;
//    private List<ColorObject> colorObjects;
//    private List<ColorSwatchRelation> relations;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public List<Translation> getTranslations() {
		return translations;
	}
	public void setTranslations(List<Translation> translations) {
		this.translations = translations;
	}
/*
	public List<ColorSwatchRelation> getRelations() {
		return relations;
	}
	public void setRelations(List<ColorSwatchRelation> relations) {
		this.relations = relations;
	}
*/	@Override
	public String toString() {
		return "ColorSwatch [id=" + id + ", displayName=" + displayName
				+ ", projectId=" + projectId + ", translations=" + translations
//				+ ", relations=" + relations 
				+ ", super.toString()="
				+ super.toString() + "]";
	}
}
