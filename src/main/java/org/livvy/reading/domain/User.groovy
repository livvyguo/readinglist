package org.livvy.reading.domain

/**
 * Created by livvy (livvyguo@gmail.com) on 2017/1/6.
 */
class User {
    Integer id;
    String name;
    String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
