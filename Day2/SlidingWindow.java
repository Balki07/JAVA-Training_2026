class SlidingWindow{
    public static void main(String[] args) {
        String str="Balaganesh";
        int k=3;
        for(int i=0;i<=str.length()-k;i++){
         System.out.println(str.substring(i,i+k));
        }
    }
}