package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person p = new Person("John Doe",32,"MALE");
        System.out.println( "Hello " + p.toString() );
    }
}
