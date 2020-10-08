package com.leaf.statusbarutil.activity;

public class Lesson {
    private String lessonName;
    private String description;
    private String pictureName;

    public Lesson(String lessonName, String description, String pictureName){
        this.lessonName = lessonName;
        this.description = description;
        this.pictureName = pictureName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public String getDescription() {
        return description;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    @Override
    public String toString() {
        return this.lessonName+"(Description:"+this.description+")";
    }
}
