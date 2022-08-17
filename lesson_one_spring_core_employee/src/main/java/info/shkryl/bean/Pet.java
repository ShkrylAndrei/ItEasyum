package info.shkryl.bean;

public class Pet {
    private String name;
    private String typeOfAnimal;

    public Pet(String name, String typeOfAnimal) {
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", typeOfAnimal='" + typeOfAnimal + '\'' +
                '}';
    }
}
