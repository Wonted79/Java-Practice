package 불변객체.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //불변객체에서 값을 변경하는 메서드는 with로 시작하는 경우가 많다. 수정사항을 포함하는 새 인스턴스 반환
    public ImmutableMyDate withYear(int newYear){
        return new ImmutableMyDate(newYear,month,day);
    }
    public ImmutableMyDate withMonth(int newMonth){
        return new ImmutableMyDate(year,newMonth,day);
    }
    public ImmutableMyDate withDay(int newDay){
        return new ImmutableMyDate(year,month,newDay);
    }

    @Override
    public String toString(){
        return year+"-"+month+"-"+day;
    }
}
