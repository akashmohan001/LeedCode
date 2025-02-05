class Solution {
    public String mergeAlternately(String str1, String str2) {
        
         int minString =str1.length()<str2.length()?str1.length():str2.length();
        int i=0;
        String result="";
         while(i!=minString){

               result +=str1.charAt(i);
               result +=str2.charAt(i);
               i++;
         }

         if(str2.length()>str1.length()){

             result+=str2.substring(i,str2.length());
         }
         else{
            result+=str1.substring(i, str1.length());
         }
     
   
    return result;
    }
}