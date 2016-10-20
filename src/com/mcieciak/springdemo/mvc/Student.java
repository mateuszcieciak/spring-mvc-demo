package com.mcieciak.springdemo.mvc;


import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;

    private LinkedHashMap<String, String> countryOptions;

    private String favouriteLanguage;

    private LinkedHashMap<String, String> languageOptions;

    private String[] operatingSystems;

    public Student() {
        countryOptions=new LinkedHashMap<>();
        countryOptions.put("BR", "Brasil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "United States of America");
        languageOptions=new LinkedHashMap<>();
        languageOptions.put("Java", "Java");
        languageOptions.put("C#", "C#");
        languageOptions.put("PHP", "PHP");
        languageOptions.put("Ruby", "Ruby");
        languageOptions.put("Python", "Python");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public LinkedHashMap<String, String> getLanguageOptions() {
        return languageOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
