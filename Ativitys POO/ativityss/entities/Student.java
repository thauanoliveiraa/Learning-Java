package entities;

public class Student {
    public String name;
    public double note1, note2, note3;

    public String name(){
        return name;
    }

    public double some(){
        return (note1+note2+note3);
    }
    
    public double verification(){
        return (some()/100);
    }

    public double missingPoints(){
        return (60.00-some());
    }

}
