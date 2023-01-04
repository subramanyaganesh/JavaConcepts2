import java.util.Objects;

public class RelationModel {

	private String parent;
	private String relType;
	private String child;
	private String parentTableName;
	private String childTableName;
	private String parentTableValue;
	private String childTableNameValue;
	private String status;

	public RelationModel(String parent, String relType, String child, String parentTableName, String childTableName, String parentTableValue, String childTableNameValue) {
		this.parent = parent;
		this.relType = relType;
		this.child = child;
		this.parentTableName = parentTableName;
		this.childTableName = childTableName;
		this.parentTableValue = parentTableValue;
		this.childTableNameValue = childTableNameValue;
	}

	public String getParentTableValue() {
		return parentTableValue;
	}

	public void setParentTableValue(String parentTableValue) {
		this.parentTableValue = parentTableValue;
	}

	public String getChildTableNameValue() {
		return childTableNameValue;
	}

	public void setChildTableNameValue(String childTableNameValue) {
		this.childTableNameValue = childTableNameValue;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getRelType() {
		return relType;
	}

	public void setRelType(String relType) {
		this.relType = relType;
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

	public String getParentTableName() {
		return parentTableName;
	}

	public void setParentTableName(String parentTableName) {
		this.parentTableName = parentTableName;
	}

	public String getChildTableName() {
		return childTableName;
	}

	public void setChildTableName(String childTableName) {
		this.childTableName = childTableName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof RelationModel)) return false;
		RelationModel that = (RelationModel) o;
		return Objects.equals(getParent(), that.getParent()) &&
				Objects.equals(getRelType(), that.getRelType()) &&
				Objects.equals(getChild(), that.getChild()) &&
				Objects.equals(getParentTableName(), that.getParentTableName()) &&
				Objects.equals(getChildTableName(), that.getChildTableName()) &&
				Objects.equals(getParentTableValue(), that.getParentTableValue()) &&
				Objects.equals(getChildTableNameValue(), that.getChildTableNameValue()) &&
				Objects.equals(getStatus(), that.getStatus());
	}

	@Override
	public String toString() {
		return "RelationModel{" +
				"parent='" + parent + '\'' +
				", relType='" + relType + '\'' +
				", child='" + child + '\'' +
				", parentTableName='" + parentTableName + '\'' +
				", childTableName='" + childTableName + '\'' +
				", parentTableValue='" + parentTableValue + '\'' +
				", childTableNameValue='" + childTableNameValue + '\'' +
				", status='" + status + '\'' +
				'}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(getParent(), getRelType(), getChild(), getParentTableName(), getChildTableName(), getParentTableValue(), getChildTableNameValue(), getStatus());
	}

}

