public class KonversiString {
    public static void main(String[] args) {
        
        String strAngka = "24";
        String strDesimal = "99.5";
        String strBenar = "true";

        int angkaInt = Integer.parseInt(strAngka);
        
        double angkaDouble = Double.parseDouble(strDesimal);
        
        float angkaFloat = Float.parseFloat(strDesimal);
  
        long angkaLong = Long.parseLong(strAngka);
        
        boolean nilaiBool = Boolean.parseBoolean(strBenar);
        
        byte angkaByte = Byte.parseByte(strAngka);
        
        short angkaShort = Short.parseShort(strAngka);

        System.out.println("String '" + strAngka + "' ke int: " + angkaInt);
        System.out.println("String '" + strDesimal + "' ke double: " + angkaDouble);
        System.out.println("String '" + strDesimal + "' ke float: " + angkaFloat);
        System.out.println("String '" + strAngka + "' ke long: " + angkaLong);
        System.out.println("String '" + strBenar + "' ke boolean: " + nilaiBool);
        System.out.println("String '" + strAngka + "' ke byte: " + angkaByte);
        System
    }
}
