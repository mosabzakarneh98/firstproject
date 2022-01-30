package com.company;
import java.util.Arrays;
import java.util.Comparator;
class G <T> implements Comparator<T>
{


    @Override
    public int compare(T o1, T o2) {
        if(o1 instanceof String && o2 instanceof String)
        {
         return (((String) o1).length()- ((String) o2).length());
        }
        else return ((Integer)o1)-((Integer)o2);
    }
}

public class Main {

    public static void main(String[] args)
    {
        Integer I[]={1,5,22,15,12,14,66,40,13,2};
        String s[]={"mosab","ahmaddf","khddfaled","baxsem"};

        Arrays.sort(I,new G<Integer>());
        for(int i :I)
        {
            System.out.println(i);
        }

        Arrays.sort(s,new G<String>());
        for(String i :s)
        {
            System.out.println(i);
        }

        Arrays.sort(s,(String s1,String s2)->s1.length()-s2.length());
        for(String i :s)
        {
            System.out.println(i);
        }
    }
}
