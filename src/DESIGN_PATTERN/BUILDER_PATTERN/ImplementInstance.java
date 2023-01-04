package DESIGN_PATTERN.BUILDER_PATTERN;

public class ImplementInstance {
    public static void main(String[] args) {
        System.out.println("///////////////////");
        Instances instances= new Instances.InstancesBuilder("id","name").build();
        System.out.println(instances);
        System.out.println("///////////////////");
        Instances bankInstances= new Instances.InstancesBuilder("id","name").setBankDetails("bankname","bankid").build();
        System.out.println(bankInstances);
        System.out.println("////////////////////");
        Instances itInstances= new Instances.InstancesBuilder("id","name").setItDetails("itname","itid").build();
        System.out.println(itInstances);
        System.out.println("///////////////////");

    }
}
