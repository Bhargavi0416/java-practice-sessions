package com.java.practice.MapInterface;

import java.util.*;
public class HashMapExProgram {

public static void main(String[] args) {
List<String> A = new ArrayList<>();
List<String> B = new ArrayList<>();
List<String> C = new ArrayList<>();
List<String> D = new ArrayList<>();
A.add("Abstract,Aspect,Allocate,Acknownledge,Applicable,Accept,Avaliable,Adjacent,Analyse");

B.add("Byte,Boolean,Basic,Buffer,Built,BooleanValue BigDecimal,ByteValue,Builer,Binary,ByteCode,Break");

C.add("Character,Char,Class,Compile,Comparator,Compare,Clear,Collection,Count,Constant,Continue,Catch,Casting,Constructor");

D.add("Decimal,Data,Double,DataStructure,Decode,Deque,Default,Dismiss, Disable,Decrease");

HashMap<String,List<String>> hmap = new HashMap();
hmap.put("A", A);//A : [Abstract,Aspect,Allocate,Acknownledge,Applicable,Accept,Avaliable,Adjacent,Analyse]

hmap.put("B", B);//B : [Byte,Boolean,Basic,Buffer,Built,BooleanValue BigDecimal,ByteValue,Builer,Binary,ByteCode,Break]

hmap.put("C", C);//C : [Character,Char,Class,Compile,Comparator,Compare,Clear,Collection,Count,Constant,Continue,Catch,Casting,Constructor]

hmap.put("D", D);//D : [Decimal,Data,Double,DataStructure,Decode,Deque,Default,Dismiss, Disable,Decrease]
//System.out.println(hmap);

for(HashMap.Entry<String,List<String>> hm:hmap.entrySet()) {
			
System.out.print(hm.getKey() + " : ");
System.out.println(hm.getValue());
}
		
		// TODO Auto-generated method stub

	}

}
