package com.boot.example1.demo;

public class Greeting {

    private final long id;
    private final String content;
    private String language;
    private String age;    

    public Greeting(long id, String content, String language, String age) {
        this.id = id;
        this.content = content;
        this.language = language;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
