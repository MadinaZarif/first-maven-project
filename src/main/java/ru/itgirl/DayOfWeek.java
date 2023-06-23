package ru.itgirl;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String translateRussian;
    DayOfWeek(String translateRussian){
        this.translateRussian = translateRussian;
    }
    public String getTranslateRussian(){
        return translateRussian;
    }
}
