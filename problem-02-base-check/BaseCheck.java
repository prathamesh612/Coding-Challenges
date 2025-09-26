public class BaseCheck {

   public static void main(String[] var0) {
      System.out.println(isValidNumber("10101", 2));
      System.out.println(isValidNumber("10201", 2));
      System.out.println(isValidNumber("76543210", 8));
      System.out.println(isValidNumber("9876543210", 8));
      System.out.println(isValidNumber("9876543210", 10));
      System.out.println(isValidNumber("ABC", 10));
      System.out.println(isValidNumber("ABC", 16));
      System.out.println(isValidNumber("Z", 36));
      System.out.println(isValidNumber("ABC", 20));
      System.out.println(isValidNumber("4B4BA9", 16));
      System.out.println(isValidNumber("5G3F8F", 16));
      System.out.println(isValidNumber("5G3F8F", 17));
      System.out.println(isValidNumber("abc", 10));
      System.out.println(isValidNumber("abc", 16));
      System.out.println(isValidNumber("AbC", 16));
      System.out.println(isValidNumber("z", 36));
   }

   private static boolean isValidNumber(String var0, int var1) {
      if (var0 != null && !var0.isEmpty() && var1 >= 2 && var1 <= 36) {
         var0 = var0.toUpperCase();
         String var2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0, var1);
         char[] var3 = var0.toCharArray();
         int var4 = var3.length;

         for (int var5 = 0; var5 < var4; ++var5) {
            char var6 = var3[var5];
            if (var2.indexOf(var6) == -1) {
               return false;
            }
         }
         return true;
      } else {
         return false;
      }
   }
}