package org.example;

public class Player {
    private int id;
    private String name;
    private int rating;
    private int age;

    public Player(int id, String name, int rating, int age) {
        super();
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "org.example.Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", age=" + age +
                '}';
    }
}
