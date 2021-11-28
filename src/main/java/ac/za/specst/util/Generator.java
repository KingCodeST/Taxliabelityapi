package ac.za.specst.util;

import sun.text.normalizer.UCharacter;

import java.util.UUID;

public class Generator {

    protected static String generateRandomGivenSuffix(String suffix){
        return suffix +"-" + UUID.randomUUID().toString();
    }

    protected static String getClassName(Class<?> aClass){
        return aClass.getSimpleName();
    }

    public static String getId(Class<?> aClass){
        String upperLetter="";
        String className =getClassName(aClass);

        for(int i=0; i<className.length();i++){
            if(Character.isUpperCase(className.charAt(i))){
                upperLetter+=""+className.charAt(i);
            }
        }
        return generateRandomGivenSuffix(upperLetter);

    }

    public static String getPassword(){
        return UUID.randomUUID().toString().replace("-","").substring(3,8).toString();
    }

    public static String getEmployeeNumber(){
        return UUID.randomUUID().toString().replace("-","").subSequence(3, 8).toString();
    }

}
