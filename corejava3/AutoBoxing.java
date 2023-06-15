package corejava3;

public class AutoBoxing {
    public static void  main(String[] args){
        long long1 = 87888;
        double double1 = 989.98;

        int int1 = 123;
        float float1 = 1234;
        boolean bool1 = true;

        //AutoBoxing
        Long longwrap = long1;
        Double doublewrap = double1;
        // System.out.println(longwrap + " " + doublewrap);
        Integer integerwrap = int1;
        Float floatwrap = float1;
        Boolean booleanwrap = bool1;
        System.out.println("int autoboxing: "+ integerwrap);
        System.out.println("float autoboxing: "+ floatwrap);
        System.out.println("boolean autoboxing: "+ booleanwrap);
        
        long long2 = longwrap;
        double double2 = doublewrap;
        int int2 = integerwrap;
        float float2 = floatwrap;
        boolean bool2 = booleanwrap;
        System.out.println("int unboxing: "+ int2);
        System.out.println("float unboxing: "+ float2);
        System.out.println("boolean unboxing: "+ bool2);
    }
}
