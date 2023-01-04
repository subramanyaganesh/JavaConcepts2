package DESIGN_PATTERN.BUILDER_PATTERN;

public class Instances {
    private String id;
    private String name;
    private String bank_name;
    private String it_name;
    private String bank_id;
    private String it_id;

    public Instances(InstancesBuilder builder) {
        this.bank_id=builder.bank_id;
        this.id=builder.id;
        this.name=builder.name;
        this.bank_name=builder.bank_name;
        this.it_id=builder.it_id;
        this.it_name=builder.it_name;
    }
    private Instances(){

    }

    static class InstancesBuilder{
        private String id;
        private String name;
        private String bank_name;
        private String it_name;
        private String bank_id;
        private String it_id;

        public InstancesBuilder(String id, String name) {
            this.id = id;
            this.name = name;
        }
        public InstancesBuilder setBankDetails( String bank_name, String bank_id){
            this.bank_id=bank_id;
            this.bank_name=bank_name;
            return this;
        }
        public InstancesBuilder setItDetails( String it_name, String it_id){
            this.it_id=it_id;
            this.it_name=it_name;
            return this;
        }
        public Instances build(){
            return new Instances(this);
        }
    }

    @Override
    public String toString() {
        return "DESIGN_PATTERN.BUILDER_PATTERN.Instances{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bank_name='" + bank_name + '\'' +
                ", it_name='" + it_name + '\'' +
                ", bank_id='" + bank_id + '\'' +
                ", it_id='" + it_id + '\'' +
                '}';
    }
}
