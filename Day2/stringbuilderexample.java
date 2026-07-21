class stringbuilderexample{
    public static void main(String[] args) {
    StringBuilder Sb=new StringBuilder("Bala");
    Sb.insert(4,"ganesh");
    System.out.println(Sb);
    Sb.replace(0,4,"alaB");
    System.out.println(Sb);
    Sb.setCharAt(0, 'G');
    System.err.println(Sb);
    }
}