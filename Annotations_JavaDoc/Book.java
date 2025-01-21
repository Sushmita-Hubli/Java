/**@author Sushmita Hubli
 * @version 2.0
 * @since 2025
 **/

package Annotations_JavaDoc;

/**
 *
 * @author Sushmita Hubli
 *
 * Class for Library Book
 */


public class Book
{
    /**
     * @value 10 default value
     */
    static int val=10;

    /**
     *Parametrized Constructor
     * @param s
     */
    public Book(String s){}

    /**
     *Issue a book to a student
     * @param roll roll number of a student
     * @throws Exception if book is not available, throws Exception
     */
    public void issue(int roll)throws Exception{}

    /**
     *Check if book is available
     * @param str Book Name
     * @return if book is available returns true else false
     */
    public boolean available(String str){return true;}

    /**
     *Get Book Name
     * @param id Book id
     * @return returns book name
     */
    public String getName(int id){return "";}
}
