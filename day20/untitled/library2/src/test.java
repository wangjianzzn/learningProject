 class test{


     public static void main(String[] args) {
         long start = System.currentTimeMillis();
         String str = null;
        /* for (int i = 0; i < 99999; i++) {
             str += i;
         }*/
         StringBuilder sb = new StringBuilder();
         for (int i = 0; i < 99999; i++) {
             sb.append(i);
         }
         long end = System.currentTimeMillis();
         System.out.println("用时："+(end-start));
     }
}
