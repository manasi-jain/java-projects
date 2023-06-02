public class WrapperClass {
    public static void main(String[] args) {
        /* 
            Wrapper class provides a way to use primitive datatypes as reference data types
            Reference data types contains useful methods
            Can be used with certain Collections

            Disadvantage reference data types over primitive data types is that they are slower to access.
        */

        /* 
            Each primitive data type comes with its own corresponding wrapper class
            
            primitive           Wrapper
            boolean             Boolean
            int                 Integer
            char                Character
            double              Double

            !!!! String class biggest example - its methods like length(), charAt(), trim() etc.
        */
        /* 
            Java has this feature called autoboxing & unboxing
            autoboxing - the automatic conversion that the java compiler makes between primitive data types
                         and their corresponding object wrapper classes.
            unboxing - reverse of autoboxing. Automatic conversion of wrapper class to primitive type
        */

        //autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "You";

        System.out.println(a.booleanValue());
        System.out.println(e.length());

        //unboxing
            if(a==true) System.out.println("true");
    }
}
