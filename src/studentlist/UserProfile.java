
//to fetch and merge
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author ADMIN
 */
class UserProfile {
    private String name;
    private String favoriteGenre;

    public UserProfile(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }
}

