public class Student {
    private String name;
    private String surname;
    private String address;
    private int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + surname + " Адрес: " + address + " ID: "  + id;
    }

    public static void main(String[] args) {
        Student alice = new Student("Алиса", "Смит", "Коктем-2", 24);
        Student azamat = new Student("Азамат", "Адилов", "Мамыр-4", 25);
        Student kristina = new Student("Кристина", "Иванова", "Алмагуль", 26);

        System.out.println(alice);
        System.out.println(azamat);
        System.out.println(kristina);
    }
}
