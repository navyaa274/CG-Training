package Dec31.Level1Assignment;

public class Question5 {
    public static void main(String[] args) {
        
        /*
        Q5: Suppose you have to divide 14 pens among 3 students equally. Write a program to find how 
        many pens each student will get if the pens must be divided equally. Also, find the remaining 
        non-distributed pens.
        */

        int totalPens = 14;
        int totalStudents = 3;

        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);

        /*
        output:

        The Pen Per Student is 4 and the remaining pen not distributed is 2
        */
    }
}
