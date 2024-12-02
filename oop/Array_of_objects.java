package oop;

class Subject{
    private String subID;
    private String name;
    private int maxmarks;
    private int marksobtained;
    public Subject(String subID,String name)
    {
        this.subID=subID;
        this.name=name;
    }

    public String getSubID() {
        return subID;
    }



    public String getName() {
        return name;
    }


    public int getMaxmarks() {
        return maxmarks;
    }

    public void setMaxmarks(int maxmarks) {
        this.maxmarks = maxmarks;
    }

    public int getMarksobtained() {
        return marksobtained;
    }

    public void setMarksobtained(int marksobtained) {
        this.marksobtained = marksobtained;
    }

    public String toString()
    {
        return subID+"\n"+name+"\n"+maxmarks+"\n"+marksobtained;
    }


}
public class Array_of_objects
{
    public static void main(String[] args) {
       Subject []s=new Subject[3];
       s[0]=new Subject("1","Maths");

        s[1]=new Subject("2","Maths");
        s[2]=new Subject("3","Maths");

       for (Subject s1:s)
       {
           System.out.println(s1);
       }




    }
}
