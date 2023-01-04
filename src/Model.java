import java.util.Objects;

public class Model {
    private String parent;
    private String relType;
    private String child;

    public Model(String parent, String relType, String child) {
        this.parent = parent;
        this.relType = relType;
        this.child = child;
    }

    @Override
    public String toString() {

        return "Model{" +
                "parent='" + parent + '\'' +
                ", relType='" + relType + '\'' +
                ", child='" + child + '\'' +
                "}  " /*+ super.toString()*/;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Model)) return false;
        Model model = (Model) o;
        return Objects.equals(parent, model.parent) &&
                Objects.equals(relType, model.relType) &&
                Objects.equals(child, model.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, relType, child,super.hashCode());
    }

}
