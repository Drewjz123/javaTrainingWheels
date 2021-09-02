//import jdk.javadoc.internal.doclets.formats.//html.SourceToHTMLConverter;

// import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class PairStar {
 static String str = "hello";
 static String bc = pairStar(str);
 static int count = 0;
 
 public static void main(String [] args){
  //System.out.println("Hello World");
  int index = 0;
  // System.out.println(str);
  //System.out.println(str.charAt(index) + str.charAt(index+1));
  // int
  System.out.println(bc);
  }


  public static String pairStar(String str) {
   if(str.length() <= 1){
     return str;
   }
   else{
     if(str.substring(0,1)== str.substring(1,2)){
       
       return str.charAt(0) + "*" + str.charAt(1) + pairStar(str.substring(1));
       
     }
     return str.charAt(0) + str.charAt(1)+ pairStar(str.substring(1));
   }
 }
 
  // public static String pairStar(String str){
   
  //  if(str.length() <= 1){
  //   return str;
  //  }else{
  //   if(str.charAt(0) == str.charAt(1)){
      
  //   }
  //  }

 


  // }

 }
 
 