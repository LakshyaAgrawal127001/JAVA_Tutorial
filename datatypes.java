public class datatypes {
    public static void main(String[] args) {
        /* Data types are 2
           Primitive
            1. Byte -1 = [-128 to 127]
            2. short - 2 = [-32,768 to 32,767]
            3. int - 4 = [- 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)]
            4. long - 8 =[ -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)]
            5. float - 4
            6. double - 8
            7. char - 2
            8. boolean - 1
          
        */
       byte age = 12;
       int phone = 1234567890;
       long phone2 = 12345678900L;
       float pi = 3.14F;
       double div = 234231.4343D;
       char letter = 'a';
       boolean isage18 = true; 
       short sort = 3000;
       

        // Non - Primitive / Refernce
        String name = "Java Developer";
        System.out.println(name.length());
        // new keywords used is fixed 
       String name2 = new String("Java2 developer");
    }
}
