
class PrintZ{
  public static void PrintZ(String[] args) {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (i == 0 || i == 4 || j == 4 - i){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
         }
      System.out.println();
    }
  }
}
